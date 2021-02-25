package Practice3;

//Даны действительные числа a1, a2, ... Поменять местами наибольший и наименьший элементы

import java.util.Scanner;

public class Task2_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        double[] nums = new double[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextDouble();

        System.out.println("Изначальный массив:");
        for (double el : nums)
            System.out.print(el + " ");
        System.out.println();

        double min = nums[0], max = nums[0];
        int indexMin = 0, indexMax = 0;

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                indexMin = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                indexMax = i;
            }
        }

        nums[indexMin] = max;
        nums[indexMax] = min;

        System.out.println("Изменённый массив:");
        for (double el : nums)
            System.out.print(el + " ");
    }
}
