package intro_to_java.practice_02;

// Дано натуральное число N. Написать метод (методы) для формирования массива,
// элементами которого являются цифры числа N

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное положительное число: ");
        int N = scanner.nextInt();
        Integer[] arrayN = createArray(N);
        System.out.println("Вывод массива:");
        System.out.println(Arrays.toString(arrayN));
    }

    public static Integer[] createArray (int n) {
        Integer[] array = new Integer[0];
        ArrayList<Integer> nums= new ArrayList<>();
        while (n != 0) {
            nums.add(0,n % 10);
            n /= 10;
        }
        return nums.toArray(array);
    }
}
