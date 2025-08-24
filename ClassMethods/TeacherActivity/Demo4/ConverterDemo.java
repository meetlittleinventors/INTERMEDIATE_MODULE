class Converter {
    double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

public class ConverterDemo {
    public static void main(String[] args) {
        Converter conv = new Converter();
        System.out.println("0°C = " + conv.celsiusToFahrenheit(0) + "°F");
        System.out.println("212°F = " + conv.fahrenheitToCelsius(212) + "°C");
    }
}
