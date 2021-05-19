package nika.mgaloblishvili.weather.nika_mgaloblishvili_davaleba_1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {

    private String cityName;
    private int temperature;
    private int humidity;
    private int pressure;

    private DirectionType direction;
    private int speed;


    public Weather() {
    }

    public Weather(String cityName, int temperature, int humidity, int pressure, DirectionType direction, int speed) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.direction = direction;
        this.speed = speed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", direction=" + direction +
                ", speed=" + speed +
                '}';
    }
}
