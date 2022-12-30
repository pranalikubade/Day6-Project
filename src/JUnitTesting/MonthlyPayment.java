package JUnitTesting;

public class MonthlyPayment {
    public static void main(String[] args) {

        int P = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        float R = Integer.parseInt(args[2]);
        float n=12*Y;
        float r= R/(12*100);
        float payment = (float) ((P * r) / Math.pow(1 - (1 + r) , (-n)));
        System.out.println("Monthly Payment :" + payment);


    }
}
