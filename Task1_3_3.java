package intro_to_java.practice_01;

//Найти сумму квадратов первых ста чисел.

public class Task1_3_3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + sum);
    }
}
