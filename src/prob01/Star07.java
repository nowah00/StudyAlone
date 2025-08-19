package prob01;

import java.util.Scanner;

public class Star07 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int n = in.nextInt();
        int a = n;
        int b = n-1;

        for (int i = 1; i <= n; i++) {
            for (int j = a-1; j > 0; j--) {
                System.out.print("_");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            for (int j = 2*b-1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            b--;
        }
    }
}
