package gn.learn.springdatarest;


import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryServiceApplicationTests {
	
	@Autowired
	private BookRepo bookRepo;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void persistenceWorks() {
		assertThat(bookRepo.findAll(), not(Matchers.emptyIterable()));
	}

}
