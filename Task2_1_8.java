package Practice2;

// Дана последовательность целых чисел a1, a2, ..., an.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an).

import java.util.Scanner;

public class Task2_1_8 {
    public static void main(String[] args) {
        int count = 1;
        int[] newNums;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();

        // Определяем минимальный элемент и их количество в массиве
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min >= nums[i]) {
                if (min == nums[i]) {
                    count++;
                } else {
                    min = nums[i];
                    count = 1;
                }
            }
        }

        // Создаём новый массив и копируем туда элементы заданные условием
        newNums = new int[nums.length - count];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != min) {
                newNums[j] = nums[i];
                j++;
            }
        }

        for (int el : newNums) {
            System.out.print(el + " ");
        }
    }
}
