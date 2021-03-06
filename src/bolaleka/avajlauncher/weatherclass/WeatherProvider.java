package bolaleka.avajlauncher.weatherclass;

import bolaleka.avajlauncher.aircraft.Coordinates;


public class WeatherProvider {

    private static WeatherProvider weatherProvider;
    private String[] weather = new String[]{"SUN", "RAIN", "FOG", "SNOW"};

    private static void WeatherProvider(){}

    public static WeatherProvider getProvider(){
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        
        int nearestNum = coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight();
    
        if(nearestNum <= 40) {
            return weather[3];
        }else if(nearestNum > 40 && nearestNum <= 60) {
            return weather[2];
        }else if(nearestNum > 60 && nearestNum <= 80) {
            return weather[1];
        }else if(nearestNum > 80){
            return weather[0];
        }else {
            return ("invalid weather\n");
        }

    }
}