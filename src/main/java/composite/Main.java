package composite;

public class Main {
  public static void main(String[] args) {
    System.out.println("Making root entries...");

    Directory rootDirectory = new Directory("root");
    Directory binDirectory = new Directory("bin");
    Directory tmpDirectory = new Directory("tmp");
    Directory usrDirectory = new Directory("usr");
    rootDirectory.add(binDirectory);
    rootDirectory.add(tmpDirectory);
    rootDirectory.add(usrDirectory);
    binDirectory.add(new File("vi", 1234));
    rootDirectory.printList();

    System.out.println("End");
  }
}