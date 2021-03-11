package intro_to_java.practice_02;

// Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из
// числе 1, 2, 3,..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух
// больших диагоналей равны между собой. Построить такой квадрат.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_2_16 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][]  magicSquare;
        int degree;
        Scanner scanner = new Scanner(System.in);
        while (true) {
                try {
                    System.out.println("Введите порядок для матрицы не более двух.");
                    System.out.print("Чтобы выйти введите \"1\": ");
                        degree = scanner.nextInt();
                    if (degree < 3 && degree != 1) {
                        throw new IllegalArgumentException();
                    } else if (degree % 2 != 0 && degree != 1) {
                        magicSquare = matrix.createOddMatrix(degree);
                    } else if (degree % 4 == 0) {
                        magicSquare = matrix.createEven4Matrix(degree);
                    } else if (degree % 2 == 0) {
                        magicSquare = matrix.createEven2Matrix(degree);
                    } else {
                        System.out.println("Завершение программы");
                        break;
                    }
                    matrix.showMatrix(magicSquare);
                    matrix.testMagic(magicSquare);
                } catch (IllegalArgumentException e) {
                    System.out.println("Не допустимое значение. Попробуйте снова!");
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Критическая ошибка ввода. Аварийное завершение программы :(.");
                    break;
                }
            }
    }

    static class Matrix {

        public int[][] createOddMatrix(int n) {
            int[][] twoArray = new int[n][n];
            // по методу Постникова первое число (1) вставляется
            // в середину верхней строчки
            int x = n / 2;
            int y = twoArray.length - 1;

            for (int count = 1; count <= n * n; count++) {
                // Вставляем число на позицию
                twoArray[(twoArray.length - 1) - y][x] = count;
                // Проверяем является ли оно кратным порядку матрицы
                if (twoArray[twoArray.length - 1 - y][x] % n == 0) {
                    // если да, то меняем позицию для след числа так
                    y--;
                } else {
                    // если нет, то так
                    if (x == twoArray.length - 1) x = -1;
                    if (y >= twoArray.length - 1) y = -1;
                    y++;
                    x++;
                }
            }
            return twoArray;
        }

        public int[][] createEven4Matrix(int n) {
            // Создаём и заполняем две матрицы, первый элемент
            // основной матрицы 1, вспомогательной n * n
            int[][] twoArray = new int[n][n];
            int[][] helpArray = new int[n][n];
            int count = 0;
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    helpArray[i][j] = n * n - count;
                    count++;
                    twoArray[i][j] = count;
                }
            }

            // Условно основная матрица разбивается на квадраты 4 х 4
            // в которых условно проводятся диагонали, элементы, которые
            // ложаться на диагонали меняются с элементами вспомогательной матрицы
            for (int i = 0; i < twoArray.length; i += 4) {
                for (int j = 0; j < twoArray[i].length; j += 4) {
                    for (int k = i, l = j, m = j + 3;  k < i + 4;  k++, l++, m--) {
                        twoArray[k][l] = helpArray[k][l];
                        twoArray[k][m] = helpArray[k][m];
                    }
                }
            }
            return twoArray;
        }

        public int[][] createEven2Matrix(int n) {
            // Создаём основную матрицу
            int[][] twoArray = new int[n][n];

            // Делим её на 4 равных матрицы нечётного порядка, левую
            // верхнюю заполняем как магический квадрат нечетного порядка
            int[][] leftUpArr = createOddMatrix(n / 2);
            int[][] rightUpArr = new int[n / 2][n / 2];
            int[][] leftDownArr = new int[n / 2][n / 2];
            int[][] rightDownArr = new int[n / 2][n / 2];

            // Прибовляя к элементам левой верхней матрице 2(n / 2)(n / 2)
            // к правой верхней, 3(n / 2)(n / 2) к левой нижней и (n / 2)(n / 2)
            // к правой нижней, получаем все заполненные вспомогательные матрицы
            for (int i = 0; i < leftUpArr.length; i++) {
                for (int j = 0; j < leftUpArr[i].length; j++) {
                    rightUpArr[i][j] = leftUpArr[i][j] + (2 * (n / 2) * (n / 2));
                    leftDownArr[i][j] = leftUpArr[i][j] + (3 * (n / 2) * (n / 2));
                    rightDownArr[i][j] = leftUpArr[i][j] + ((n / 2) * (n / 2));
                }
            }

            // Меняем последние столбцы левых матриц и первые правых, общее
            // количество столбцов расчитывается по формуле n / 2 - 3
            for (int columns = (n / 2 - 3) / 2; columns > 0; columns--) {
                for (int line = 0; line < leftUpArr.length; line++) {
                    int helper = leftUpArr[line][leftDownArr[line].length - columns];
                    leftUpArr[line][leftDownArr[line].length - columns] =
                            leftDownArr[line][leftDownArr[line].length - columns];
                    leftDownArr[line][leftDownArr[line].length - columns] = helper;

                    helper = rightUpArr[line][columns - 1];
                    rightUpArr[line][columns - 1] = rightDownArr[line][columns - 1];
                    rightDownArr[line][columns - 1] = helper;
                }
            }


            // также меняются первый и последний элементы первого
            // столбца (индекс 0) и все элементы 2-ого столбца (индекс 1)
            // кроме первого и последнего элемента в левых матрицах
            for (int i = 0, j = 0; i < leftUpArr.length; i++) {
                int helper = leftUpArr[i][j];
                leftUpArr[i][j] = leftDownArr[i][j];
                leftDownArr[i][j] = helper;

                j = (i == leftUpArr.length - 2) ? 0 : 1;
            }

            // Соединяем 4 матрицы в одну
            int[][][] matrices = {leftUpArr, rightUpArr, leftDownArr, rightDownArr};
            for (int k = 0, bigI = 0, bigJ = 0; k < matrices.length; k++) {
                switch (k) {
                    case 1:
                        bigI = 0;
                        bigJ = leftUpArr.length;
                        break;
                    case 2:
                        bigI = leftUpArr[0].length;
                        bigJ = 0;
                        break;
                    case 3:
                        bigI = leftUpArr.length;
                        bigJ = leftUpArr[0].length;
                }
                for (int smallI = 0; smallI < matrices[k].length; smallI++, bigI++) {
                    for (int smallJ = 0; smallJ < matrices[k][smallI].length; smallJ++, bigJ++) {
                        twoArray[bigI][bigJ] = matrices[k][smallI][smallJ];
                    }
                    bigJ -= matrices[k][smallI].length;
                }
            }
            return twoArray;
        }

        public void showMatrix(int[][] matrix) {
            for (int[] arr : matrix) {
                for (int el : arr) {
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }

        public void testMagic(int[][] matrix) {
            boolean magic = true;
            int standardSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                standardSum += matrix[0][j];
            }
            // Проверяем горизонтали
            for (int i = 1; i < matrix.length; i++) {
                int horzSum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    horzSum += matrix[i][j];
                }
                magic = (horzSum == standardSum) && magic;
            }

            // Проверяем вертикали
            for (int j = 0; j < matrix[0].length; j++) {
                int vertSum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    vertSum += matrix[i][j];
                }
                magic = (vertSum == standardSum) && magic;
            }

            // Проверяем диогонали
            int diogSum1 = 0;
            int diogSum2 = 0;
            for (int i = 0, k = 0, l = matrix.length - 1; i < matrix.length; i++, k++, l--) {
                diogSum1 += matrix[i][k];
                diogSum2 += matrix[i][l];
            }
            if (diogSum1 == diogSum2 && diogSum1 == standardSum && magic) {
                System.out.println("Cуммы вертикалей, горизонталей и диагоналей равны. " +
                        "Квадрат магический");
            } else {
                System.out.println("Квадрат не магический");
            }
        }
    }
}
