package intro_to_java.practice_01;

// 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_5 {
    public static void main(String[] args) throws IOException {
        int T;
        int hour;
        int minute;
        int sec;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(reader.readLine());

        hour = T / 3600;
        minute = (T % 3600) / 60;
        sec = T % 3600 % 60;

        System.out.println(hour + "ч " + minute + "мин " + sec + "с");
    }
}
