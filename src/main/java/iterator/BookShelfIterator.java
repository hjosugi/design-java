package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
  private BookShelf bookShelf;
  private int currentIndex;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.currentIndex = 0;
  }

  @Override
  public boolean hasNext() {
    return this.currentIndex < this.bookShelf.getLength() ? true : false;
  }

  @Override
  public Book next() {
    if (!this.hasNext()) {
      throw new NoSuchElementException();
    }
    Book book = bookShelf.getBookAt(currentIndex);
    currentIndex++;
    return book;
  }
}