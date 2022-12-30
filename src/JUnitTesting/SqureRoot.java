package JUnitTesting;

import java.util.Scanner;

public class SqureRoot {
    public static void main(String[] args) {
        System.out.println("Enter nonnegative number");
        Scanner s=new Scanner(System.in);
        double c=s.nextDouble();
        double epsilon = 1e-15;
        double t = c;


        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println("Squre Root of "+c+" = "+t);
    }
}
