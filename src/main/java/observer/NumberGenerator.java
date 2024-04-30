package observer;

import java.util.List;
import java.util.ArrayList;

public abstract class NumberGenerator {
  private List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  public abstract int getNumber();

  public abstract void execute();
}
