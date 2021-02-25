package Practice2;

// Дана последовательность действительных чисел. Заменить все ёё члены числом Z если они его больше.
// Посчитать количество замен

import java.util.Scanner;

public class Task2_1_2 {
    public static void main(String[] args) {
        int replace = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        int[] nums = new int[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();
        System.out.print("Укажите число Z: ");
        int Z = scanner.nextInt();

        System.out.println("Изначальный массив:");
        for (int el : nums)
            System.out.print(el + " ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > Z) {
                nums[i] = Z;
                replace++;
            }
        }
        System.out.println();

        System.out.println("Изменённый массив:");
        for (int el : nums)
            System.out.print(el + " ");
        System.out.println();
        System.out.println("Количество замен: " + replace);
    }
}
