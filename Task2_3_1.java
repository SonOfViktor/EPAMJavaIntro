package Practice2;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами
// первого, при этом не используя дополнительный массив

import java.util.Scanner;

public class Task2_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер первого массива: ");
        int size1 = scanner.nextInt();
        System.out.println("Введите размер второго массива: ");
        int size2 = scanner.nextInt();
        System.out.println("Введите число k: ");
        int k = scanner.nextInt();

        int[] firstArr = new int[size1 + size2];
        int[] secondArr = new int[size2];
        for (int i = 0; i < firstArr.length - secondArr.length; i++) {
            firstArr[i] = (int) (Math.random() * 100);
        }

        for (int j = 0; j < secondArr.length; j++) {
            secondArr[j] = (int) (Math.random() * 100);
        }

        System.out.println("Изначальный первый массив:");
        for (int el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Изначальный второй массив:");
        for (int el : secondArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int i = firstArr.length - secondArr.length - 1,
                j = secondArr.length - 1; j >= 0; i--) {
            if (i > k) {
                firstArr[i + secondArr.length] = firstArr[i];
            } else {
                firstArr[i + secondArr.length] = secondArr[j];
                j--;
            }
        }

        System.out.println("Соединенный массив:");
        for (int el : firstArr) {
            System.out.print(el + " ");
        }
    }
}
