package factory.idcard;

import factory.Product;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println("Create" + owner);
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println("Use" + this);
  }

  @Override
  public String toString() {
    return "[IDCard:" + owner + "]";
  }

  public String getOwner() {
    return owner;
  }
}
