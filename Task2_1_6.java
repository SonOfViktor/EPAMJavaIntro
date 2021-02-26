package Practice2;

// Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами

import java.util.Scanner;

public class Task2_1_6 {
    public static void main(String[] args) {
        double sum = 0.0;
        boolean isSimple;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        double[] nums = new double[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextDouble();

        for (int i = 2; i < nums.length; i++) {
            isSimple = true;
            int j = 2;
            while (j <= i / 2) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
                j++;
            }
            if (isSimple)
                sum += nums[i];
        }
        System.out.println("Сумма равна: " + sum);
    }
}
