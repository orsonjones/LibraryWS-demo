
package net.afriskito.demo.libraryws;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    private final Map<Integer, Book> books = new HashMap<>();
    private int nextId = 0;

    public Map<Integer, Book> getAllBooks() {
        return Map.copyOf(books);
    }
    
    public int addBook(Book book) {
        int bookId = nextId++;
        books.put(bookId, book);
        return bookId;
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public void setBook(int id, Book book) {
        if (books.containsKey(id))
            books.put(id, book);
    }
    
    public void removeBook(int id) {
        books.remove(id);
    }
}
