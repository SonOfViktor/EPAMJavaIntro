package Practice1;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Task1_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        String strNum1 = Integer.toString(number1);
        String strNum2 = Integer.toString(number2);

        for (char ch = '0'; ch < '9'; ch++) {
            for (int i = 0; i < strNum1.length(); i++)
                for (int j = 0; j < strNum2.length(); j++)
                    if (strNum1.charAt(i) == strNum2.charAt(j) && strNum1.charAt(i) == ch)
                        System.out.print(strNum1.charAt(i));
        }

    }
}
