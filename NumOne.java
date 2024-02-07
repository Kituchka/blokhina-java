import java.util.Scanner;

public class NumOne {
    //сравнение
    public static void main(String[] args) {
        System.out.println("Сравнение");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        if (a < b) {
            System.out.println("Число " + a + " меньше числа " + b);
        } else if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else {
            System.out.println("Число " + a + " равно числу " + b);
        }

        //операции
        System.out.println("Арифметика");
        System.out.println("Введите число а: ");
        int c = in.nextInt();
        System.out.println("Введите число b: ");
        int d = in.nextInt();
        System.out.println(c + "+" + d + "=" + (c + d));
        System.out.println(c + "-" + d + "=" + (c - d));
        System.out.println(c + "*" + d + "=" + (c * d));
        System.out.println(c + "/" + d + "=" + (c / d));

    }
}




  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
    }
} */