package factory.idcard;

import factory.Factory;
import factory.Product;

public class IDCardFactory extends Factory {
  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println("Register" + product);
  }
}
