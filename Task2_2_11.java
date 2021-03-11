package intro_to_java.practice_02;

// Матрицу 10 х 20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу
// и номера строк, в которых число 5 встречается три и более раз.

public class Task2_2_11 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.createMatrix();
        matrix.showMatrix();
        System.out.println();
        System.out.println("Номера строк, в которых 5 встречается более 3 раз: ");
        matrix.lineOfFives();
    }

    static class Matrix {
        int[][] twoArray;

        public void createMatrix() {
            twoArray = new int[10][20];
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    twoArray[i][j] = (int) (Math.random() * 16);
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

        public void lineOfFives() {
            for (int i = 0; i < twoArray.length; i++) {
                int countFives = 0;
                for (int j = 0; j < twoArray[i].length; j++) {
                    if (twoArray[i][j] == 5) {
                        countFives++;
                    }
                }
                if (countFives >= 3) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
