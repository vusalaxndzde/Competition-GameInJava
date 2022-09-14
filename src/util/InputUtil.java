package util;

import java.util.Scanner;

public class InputUtil {

    public static String nextLine(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextLine();
    }

    public static int nextInt(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextInt();
    }
}
