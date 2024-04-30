package observer;

public class GraphObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) {
    System.out.println("GraphObserver: ");
    int count = generator.getNumber();
    System.out.println(count);
    for (int i = 0; i < count; i++) {
      System.out.print("*");
    }
    System.out.println("");
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
    }
  }
}
