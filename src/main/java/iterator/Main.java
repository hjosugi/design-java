package iterator;

import java.util.Locale;
import com.github.javafaker.Faker;

public class Main {
  public static void main(String[] args) {
    Locale locale = new Locale("en-IND");
    Faker faker = new Faker(locale);
    BookShelf bookShelf = new BookShelf(6);

    for (int i = 0; i < 6; i++) {
      bookShelf.appendBook(new Book(faker.book().title()));
    }
    for (Book book: bookShelf){
      System.out.println(book.getTitle());
    }
    System.out.println();
  }
}
