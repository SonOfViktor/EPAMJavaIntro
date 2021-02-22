package Practice1;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task1_3_6 {
    public static void main(String[] args) {
        for(int i = 0; i <= 65536; i++) {
            char ch = (char) i;
            System.out.println(i + " " + ch);
        }
    }
}
