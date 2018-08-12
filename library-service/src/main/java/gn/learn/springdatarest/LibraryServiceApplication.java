package gn.learn.springdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LibraryServiceApplication {

@Component
class DataSetup implements ApplicationRunner{

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Book book1 = new Book("Effective Java", "12345");
		bookRepo.save(book1);
		Book book2 = new Book("Learning Spring Boot", "78465");
		bookRepo.save(book2);
	}}


	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceApplication.class, args);
	}
}
