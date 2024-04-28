package builder;

public class TextBuilder extends Builder {
  private StringBuilder sb = new StringBuilder();

  @Override
  public void makeTitle(String title) {
    sb.append("[");
    sb.append(title);
    sb.append("]");
  }

  @Override
  public void makeString(String str) {
    sb.append(str);
  }

  @Override
  public void close() {
    sb.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    sb.append("  * ");
  }
}
