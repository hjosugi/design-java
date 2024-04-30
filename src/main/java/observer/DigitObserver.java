package observer;

public class DigitObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) {
    System.out.println("Digit: " + generator.getNumber());
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
    }
  }
}
