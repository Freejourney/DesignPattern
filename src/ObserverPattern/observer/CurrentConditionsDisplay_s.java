package ObserverPattern.observer;

import ObserverPattern.DisplayElement;
import ObserverPattern.subject.WeatherData_s;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay_s implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay_s(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData_s) {
            WeatherData_s weatherData_s = (WeatherData_s) o;
            this.temperature = weatherData_s.getTemperature();
            this.humidity = weatherData_s.getHumidity();
            display();
        }
    }
}
