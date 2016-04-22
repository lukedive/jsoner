package pl.snowy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("book")
public class BooksResource {

	@GET
	public String getBook() {
		return "Ptaki polskie i zagraniczne";
	}

	@GET
	@Produces("application/json")
	@Path("isbn={isbn}")
	public Book getBook(@PathParam("isbn") String isbn) {
		return new Book("Cool book", isbn );
	}
}
