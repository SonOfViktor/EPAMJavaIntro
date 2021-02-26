package Practice2;

// Даны действительные числа a1, a2, ... a2n. Найти max(a1 + a2n, a2 + a2n-1, ... an + an+1)

import java.util.Scanner;

public class Task2_1_7 {
    public static void main(String[] args) {
        double max;
        double sumOfMembers;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите чётный размер массива: ");
        int N = scanner.nextInt();
        double[] nums = new double[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextDouble();

        max = nums[0] + nums[nums.length - 1];
        for (int i = 1; i < nums.length / 2; i++) {
            sumOfMembers = nums[i] + nums[nums.length - 1 - i];
            if (sumOfMembers > max)
                max = sumOfMembers;
        }
        System.out.println("Максимальная сумма членов массива равна: " + max);
    }
}
