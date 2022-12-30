package LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("Enter number Fibonacci Series upto:");
        int n = scan.nextInt();
        System.out.print("Fibonacci Series till " + n + " terms : " + a + " ," + b + " ,");
        for (int i = 2; i < n; i++) {
            int value = a + b;
            System.out.print(value + " ,");
            a = b;
            b = value;

        }

    }
}
