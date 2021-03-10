package intro_to_java.practice_02;

// Написать метод(методы) для нахождения наибольшего общего делителя
// четырёх натуральных чисел.

import java.util.Scanner;

public class Task2_4_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        System.out.println("Введите 4 натуральных числа: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(commonNOD(nums));
    }

    public static int commonNOD(int[] array) {
        int commonNod = NOD(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            commonNod = NOD(commonNod, array[i]);
        }
        return commonNod;
    }

    public static int NOD(int a, int b) {
        if (a % b == 0)
            return b;
        return NOD(b, a % b);
    }

}
