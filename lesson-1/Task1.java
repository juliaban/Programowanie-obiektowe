final class Date{
    int day;
    String month;
    int year;
    Weather todaysWeather;
    
    void text(){
        System.out.print("Today's date: " + day + " " + month + " " + year + "\n");
    }
}


final class Weather{
    int tempDay;
    int tempNight;
    String precip;
    String cloud;
    
    void text(){
        System.out.print("Temperature on the day: " + tempDay + "\n");
        System.out.print("Temperature at night: " + tempNight + "\n");
        System.out.print("Amount of precip: " + precip + "\n");
        System.out.print("Size of the cloud: " + cloud + "\n");
    }
}

public class Task1 {

    public static void main(String[] args) {
        Date newDate = new Date();
        newDate.day = 16;
        newDate.month = "October";
        newDate.year = 2022;
        Weather newWeather = new Weather();
        newWeather.tempDay = 23;
        newWeather.tempNight = 13;
        newWeather.precip = "No precipitation";
        newWeather.cloud = "No clouds";
        newDate.todaysWeather = newWeather;
        
        newDate.text();
        newWeather.text();
    }
}
