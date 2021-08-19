package net.afriskito.demo.libraryws;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("books")
public class BooksResource {
    private BookService bookService;

    @Inject
    public BooksResource(BookService bookService) {
        this.bookService = bookService;
        bookService.setBook(0, Book.create("Test", "Unknown", 2021));
    }
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<Integer, Book> getBooks() {
        return bookService.getAllBooks();
    }
}
