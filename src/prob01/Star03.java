package prob01;

import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;

        for (int i = 1; i <= n; i++) {
            for (int j = a-1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
