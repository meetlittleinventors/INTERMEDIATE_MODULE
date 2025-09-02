class Temperature {
    private double celsius;

    public void setTemperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setTemperature(25);
        System.out.println("Temperature in Celsius: " + t.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + t.getFahrenheit());
    }
}
