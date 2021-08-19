package net.afriskito.demo.libraryws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BooksResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getIt() {
        return List.of(Book.create("Test Title", "Unknown", 2021));
    }
}
