
package net.afriskito.demo.libraryws;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    private Map<Integer, Book> books = new HashMap<>();

    public Map<Integer, Book> getAllBooks() {
        return Map.copyOf(books);
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public void setBook(int id, Book book) {
        books.put(id, book);
    }
}
