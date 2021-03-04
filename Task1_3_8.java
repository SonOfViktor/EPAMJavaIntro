package Practice1;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Task1_3_8 {
    public static void main(String[] args) {
        String nums = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        String strNum1 = Integer.toString(number1);
        String strNum2 = Integer.toString(number2);

        for (char ch = '0'; ch <= '9'; ch++) {
            int i = 0;
            while (i < strNum1.length()) {
                boolean itFound = false;
                int j = 0;
                if (ch == strNum1.charAt(i)) {
                    while (j < strNum2.length()) {
                        if (ch == strNum2.charAt(j)) {
                            nums += ch + " ";
                            itFound = true;
                            break;
                        }
                        j++;
                    }
                }
                if (itFound)
                    break;
                else
                     i++;
            }
        }
        System.out.println(nums);
    }
}
