package builder;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("Normal");
    builder.makeItems(new String[] {
        "Hello", "World"
    });
    builder.close();
  }
}
