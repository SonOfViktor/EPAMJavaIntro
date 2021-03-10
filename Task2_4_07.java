package intro_to_java.practice_02;

// Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task2_4_07 {
    public static void main (String[] args) {
        System.out.println("Сумма нечётных чисел от 1 до 9: " + sumOfFact());
    }

    public static int sumOfFact() {
        int sum = 0;
        for (int i = 1; i < 10; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        }
        return factorial(a - 1) * a;
    }
}
