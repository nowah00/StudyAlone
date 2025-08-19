package prob01;

import java.util.Scanner;

public class Star04 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int n = in.nextInt();
        int a = n;

        for (int i = 1; i <= n; i++) {
            for (int j = a; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
