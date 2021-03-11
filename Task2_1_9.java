package intro_to_java.practice_02;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

import java.util.Scanner;

public class Task2_1_9 {
    public static void main(String[] args) {
        int repeatNum;
        int repeat = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();

        repeatNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (repeat <= count) {
                if (repeat == count) {
                    repeatNum = Math.min(repeatNum, nums[i]);
                } else {
                    repeatNum = nums[i];
                    repeat = count;
                }
            }
        }
        System.out.println("Наименьшее наиболее часто встречающее число: " + repeatNum);
    }
}
