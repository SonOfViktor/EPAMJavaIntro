package Practice2;

import java.util.Scanner;

// В массив A(N) занесены натуральные числа. Найти сумму тех элементов которые кратные K

public class Task2_1_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Внесите данные в массив:");
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextInt();
        System.out.print("Укажите делитель K: ");
        int K = scanner.nextInt();

        for (int element : A) {
            if (element % K == 0)
                sum += element;
        }

        System.out.print("Сумма элементов массива кратные K равна: " + sum);
    }
}
