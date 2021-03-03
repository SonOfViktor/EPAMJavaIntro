package Practice2;

// Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из
// числе 1, 2, 3,..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух
// больших диагоналей равны между собой. Построить такой квадрат.

public class Task2_2_16 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        matrix.showMatrix();
    }

    static class Matrix {
        int[][] twoArray;

        public Matrix(int n) {
            twoArray = new int[n][n];
            int x = n/2;
            int y = twoArray.length-1;

            for (int count = 1; count <= n * n; count++) {
                twoArray[(twoArray.length - 1) - y][x] = count;
                if (twoArray[twoArray.length - 1 - y][x] % n == 0) {
                    y--;
                } else {
                    if (x == twoArray.length - 1) x = -1;
                    if (y >= twoArray.length - 1) y = -1;
                    y++;
                    x++;
                }
            }
        }

        public void showMatrix() {
            for (int[] arr : twoArray) {
                for (int el : arr) {
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }
    }
}
