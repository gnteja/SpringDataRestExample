package gn.learn.springdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Book{
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String title, isbn;
	
	public Book() {
		super();
	}

	public Book(@NotNull String title, @NotNull String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

}
