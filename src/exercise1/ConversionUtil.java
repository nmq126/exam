package exercise1;

public class ConversionUtil {
    public double fahrenheitToCelsius(double fDegree) {
        return (fDegree - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double cDegree) {
        return (cDegree * 1.8) + 32;
    }
}
