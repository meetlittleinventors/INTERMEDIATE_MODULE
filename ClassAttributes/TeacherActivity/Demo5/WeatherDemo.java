class CityWeather {
    String cityName;
    int temperature;
}

public class WeatherDemo {
    public static void main(String[] args) {
        CityWeather c1 = new CityWeather();
        c1.cityName = "Delhi";
        c1.temperature = 34;

        CityWeather c2 = new CityWeather();
        c2.cityName = "Mumbai";
        c2.temperature = 28;

        System.out.println(c1.cityName + " Temp: " + c1.temperature);
        System.out.println(c2.cityName + " Temp: " + c2.temperature);

        // Update
        c1.temperature = 36;
        System.out.println(c1.cityName + " Updated Temp: " + c1.temperature);
    }
}
