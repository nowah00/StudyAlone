package prob01;

import java.util.Scanner;

public class Star03 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
