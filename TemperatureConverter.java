import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //collection of response from the user
        System.out.println("Enter C for conversion to Celsius or F for conversion to Fahrenheit: ");
        char response = scanner.next().charAt(0);

        //checking the response of the user to either convert to celsius or fahrenheit
        if (response == 'C' || response == 'c') {
            System.out.println("Enter your temperature in degrees Fahrenheit: ");
            double fahrenheitTemperature = scanner.nextDouble();
            double celsiusTemperature = (fahrenheitTemperature - 32) * 5/9;
            System.out.println("Your temperature in Celsius is " + celsiusTemperature);
        }
else if (response == 'F' || response == 'f') {
            System.out.println("Enter your temperature in degrees Celsius: ");
            double celsiusTemperature = scanner.nextDouble();
            double FahrenheitTemperature = (celsiusTemperature * 9/5) + 32;
            System.out.println("Your temperature in Fahrenheit is " + FahrenheitTemperature);
            System.out.println();
        }
    }
}