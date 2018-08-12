package gn.learn.springdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="books", collectionResourceRel="books")
public interface BookRepo extends PagingAndSortingRepository<Book, Long> {

}
