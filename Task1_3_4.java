package intro_to_java.practice_01;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigDecimal;

public class Task1_3_4 {
    public static void main(String[] args) {
        BigDecimal mult = new BigDecimal(1);
        for(int i = 1; i <= 200; i++) {
            mult = mult.multiply(BigDecimal.valueOf(i * i));
        }
        System.out.println("Произведение квадратов первых двухсот чисел равно: " + mult);
    }
}
