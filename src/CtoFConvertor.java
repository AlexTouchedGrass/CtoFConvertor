import java.util.Scanner;
import java.lang.Math;
public class CtoFConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempCelsius = 0;
        double tempFahr = 0;
        boolean valid = false;

        System.out.println("Please enter the value for Celsius that you would like to be converted to Fahrenheit.");

        do {
            if (scan.hasNextDouble()){
                tempCelsius = scan.nextDouble();

                //To Clear Buffer
                scan.nextLine();

                tempFahr = tempCelsius * (9/5) + 32;
                System.out.printf("The Fahrenheit is : %.2f" , tempFahr);
                System.out.printf("\nThe Celsius is : %.2f", tempCelsius);


                valid = true;
            } else {
                scan.nextLine();
                System.out.println("You have entered an invalid temperature. Please try again.");
                valid = false;

            }

        } while(!valid);












    }
}