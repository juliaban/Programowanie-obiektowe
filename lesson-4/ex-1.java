public class Application {
    public static void main(String[] args) {
        Forecast forecast = new Forecast.Fake();
        Weather weather = new Weather(forecast);
        assert 6==weather.todaysTemperature();
    }
}


public interface Forecast {
    public int todaysTemperature();

    public class Fake implements Forecast {
        public int todaysTemperature() {
            return 6;
        }
    }
}

public class Weather {
    private final Forecast forecast;
    public int todaysTemperature(){
        return this.forecast.todaysTemperature();
    }

    public Weather(Forecast forecast) {
        this.forecast = forecast;
    }
}
