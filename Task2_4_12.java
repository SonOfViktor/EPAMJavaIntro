package intro_to_java.practice_02;

// Даны натуральные числа K и N. Написать метод (методы) формирования массива A,
// элементами которого являются числа, сумма цифр которых равна K и которые не больше N

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число K: ");
        int K = scanner.nextInt();
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        Integer[] arrayN = createArray(K, N);
        System.out.println("Вывод массива:");
        System.out.println(Arrays.toString(arrayN));
    }

    public static Integer[] createArray(int K, int N) {
        Integer[] array = new Integer[0];
        ArrayList<Integer> nums= new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            if (figureSum(i) == K) {
                nums.add(i);
            }
        }
        return nums.toArray(array);
    }

    public static int figureSum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
