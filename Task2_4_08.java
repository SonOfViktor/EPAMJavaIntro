package intro_to_java.practice_02;

// Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5];
// D[4] + D[5] + D[6]. Примечание. Составить метод (методы) для вычисления суммы трёх
// последовательно расположенных элементов массива с номерами от k до m.

public class Task2_4_08 {
    public static void main(String[] args) {
        int[] D = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Сумма элементов от 1 по 3: " + sum(D, 1, 3));
        System.out.println("Сумма элементов от 3 по 5: " + sum(D, 3, 5));
        System.out.println("Сумма элементов от 4 по 6: " + sum(D, 4, 6));
    }

    public static int sum(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i];
        }
        return sum;
    }
}
