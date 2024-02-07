import java.util.Scanner;

public class NumTwo {
    //сравнение строк
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String a = in.next();
        System.out.println("Введите строку 2: ");
        String b = in.next();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
