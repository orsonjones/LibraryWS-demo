package net.afriskito.demo.libraryws;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.Map;

@Path("books")
public class BooksResource {
    private final BookService bookService;

    @Inject
    public BooksResource(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<Integer, Book> getBooks() {
        return bookService.getAllBooks();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Integer postBook(Book book) {
        return bookService.addBook(book);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBook(@PathParam("id") int id) {
        final Book book = bookService.getBook(id);
        if (book == null)
            return Response.status(Response.Status.NOT_FOUND).build();
        return Response.ok(book, MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void putBook(@PathParam("id") int id, Book book) {
        bookService.setBook(id, book);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void putBook(@PathParam("id") int id) {
        bookService.removeBook(id);
    }
}
