package Practice2;

// Даны целые числа a1, a2, ..., an. Вывести на печать только те числа для которых ai > i

import java.util.Scanner;

public class Task2_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        int[] nums = new int[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > i)
                System.out.print(nums[i] + " ");
        }
    }
}
