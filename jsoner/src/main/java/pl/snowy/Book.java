package pl.snowy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
//psikuS

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Book {

	private String title;

	private String isbn;

	public Book(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

	public Book() {
		super();
	}
//psikusów nie chcemy
}
