public class Application {
    public static void main(String[] args) {
        Forecast forecast = new Forecast.Fake();
        Weather weather = new Weather(forecast);
        System.out.println("Today temperature is: " + weather.getTodaysTemperature());
    }
}


public interface Forecast {
    public int getTodaysTemperature();

    public class Fake implements Forecast {
        public int getTodaysTemperature() {
            return 12;
        }
    }
}

public class Weather {
    private final Forecast forecast;

    public int getTodaysTemperature() {
        return this.forecast.getTodaysTemperature();
    }
    
    public Weather(Forecast forecast) {
        this.forecast = forecast;
    }
}
