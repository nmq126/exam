package exercise1;

public class Main {
    public static void main(String[] args) {
        ConversionUtil conversionUtil = new ConversionUtil();
        System.out.println("55 F to C: " + conversionUtil.fahrenheitToCelsius(55));
        System.out.println("40 C to F: " + conversionUtil.celsiusToFahrenheit(40));
    }
}
