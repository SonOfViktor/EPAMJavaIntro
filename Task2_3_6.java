package Practice2;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по
// возрастанию. Делается это сдедующим образом: сравниваются два соседних элемента
// aI и aI+1. Если aI <= aI+1, то продвигаются на один элемент вперёд. Если aI > aI+1,
// то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм.
// Примечение. В условии описана обычная сортировка вставками, сортировка Шелла,
// сравнивает не соседние элементы, а элементы с заданным шагом

import java.util.Scanner;

public class Task2_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер для массива: ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (Math.random() < 0.5) {
                array[i] *= -1;
            }
        }

        System.out.println("Изначальный массив: ");
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();

        int step = array.length / 2;
        while (step > 0) {
            for (int i = step; i < array.length; i++) {
                int j = i;
                while (j >= step) {
                    if (array[j] < array[j - step]) {
                        int temp = array[j];
                        array[j] = array[j - step];
                        array[j - step] = temp;
                    } else {
                        break;
                    }
                    j = j - step;
                }
            }
            step /= 2;
        }

        System.out.println("Отсортированный массив: ");
        for (int el : array) {
            System.out.print(el + " ");
        }
    }
}
