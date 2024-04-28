package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
  private String name;
  private List<Entry> directory = new ArrayList<Entry>();

  public Directory(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    int size = 0;
    for (Entry entry : directory) {
      size += entry.getSize();
    }
    return size;
  }

  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    for (Entry entry : directory) {
      entry.printList(prefix + "/" + this);
    }
  }

  public List<Entry> getDirectory() {
    return directory;
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }
}
