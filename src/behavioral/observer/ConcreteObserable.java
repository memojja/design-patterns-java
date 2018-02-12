package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserable implements Obserable {

    List<Observer> observers;

    public ConcreteObserable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.handleNotification());
    }
}
