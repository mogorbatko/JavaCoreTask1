import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        byte bt = 127;
        short s = 30000;
        int i = 2000000000;
        long l = 30000L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'q';
        boolean bl = true;

        System.out.println(exp3(1.2, 3.14, 15, 283));
        System.out.println(exp4(2.75,17.26));;
        exp5(-1);
        exp5(1);
        System.out.println(exp6(-286));
        exp7("Мария");
        years();

    }

    public static double exp3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean exp4(double a, double b) {
        return ((a + b >= 10) && (a + b <= 20));
    }

    public static void exp5(int a) {
        if (a < 0) {
            System.out.println("Отрицательное");
        } else System.out.println("Положительное");
    }

    public static boolean exp6(int a) {
        return a < 0;
    }

    public static void exp7(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void years() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(input.readLine());
        if (year % 4 != 0) {
            System.out.println("Не високосный год");
        } else if (year % 100 != 0) {
            System.out.println("Високосный год");
        } else if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

}
