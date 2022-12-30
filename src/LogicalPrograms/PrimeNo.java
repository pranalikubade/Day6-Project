package LogicalPrograms;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n= scan.nextInt();
        int m,flag =0;
        m = n/2;

        // negative numbers, 0 and 1 are not prime
        if (n < 2) {
            System.out.println("The entered number " + n + " is not a prime number");
        }else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("The entered number " + n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag==0)
            System.out.println("The entered number " + n + " is a prime number");


    }
}
