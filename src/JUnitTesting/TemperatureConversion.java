package JUnitTesting;

import java.util.Scanner;
public class TemperatureConversion {
static float f;
public static void temperatureconversion(){
        System.out.println("Enter Temperature in Fahrenheit ");
        Scanner scan = new Scanner(System.in);
        f = scan.nextFloat();
        float celsius = (f - 32) * 5 / 9;
        System.out.println("Temperature in Fahrenheit " + f + " to Celsius: " + celsius);

        }
    public static void main(String[] args) {

    TemperatureConversion.temperatureconversion();
    }
}
