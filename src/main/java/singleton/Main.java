package singleton;

public class Main {

  public static void main(String[] args) {
    System.out.println("Start");

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    String r = (s1 == s2) ? "Sameiiiiaasdfasdf" : "Different";
    System.out.println(r);

    System.out.println("End");
  }
}
