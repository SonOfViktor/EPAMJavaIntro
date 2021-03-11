package intro_to_java.practice_02;

// Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
// элемент (освоболодившиеся элементы заполнить нулями). Примечание: Дополнительный массив не использовать.

import java.util.Scanner;

public class Task2_1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();

        System.out.println("Изначальный массив: ");
        for (int el : nums)
            System.out.print(el + " ");
        System.out.println();

        for (int i = 1; i < nums.length; i += 2)
            nums[i] = 0;

        System.out.println("Изменённый массив: ");
        for (int el : nums)
            System.out.print(el + " ");
    }
}
