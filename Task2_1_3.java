package Practice3;

// Дан массив дейстительных чисел, размерность которого N. Подсчитать, сколько в нём отрицательных,
// положительных и нулевых элементов

import java.util.Scanner;

public class Task2_1_3 {
    public static void main(String[] args) {
        int positive = 0;
        int negotive = 0;
        int zero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        double[] nums = new double[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextDouble();

        for (double el : nums) {
            if (el < 0)
                negotive++;
            else if (el > 0)
                positive++;
            else
                zero++;
        }

        System.out.println("Количество отрицательных чисел: " + negotive);
        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество чисел равных нулю: " + zero);
    }
}
