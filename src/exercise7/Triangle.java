package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println();
        for (int line = 1; line <= n*2; line++) {
          if(line > n) {
            printLine(1, n*2 - line);
          } else {
            printLine(1, line);
          }
        }

    }

    public static void printLine(int start, int end) {
      for(int i = 1; i <= end; i++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
}
