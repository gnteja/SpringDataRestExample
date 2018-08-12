package gn.learn.springdatarest;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

	@RestResource(path= "by-name")
	Collection<Reservation> findByReservationName(@Param("by-name") String rn);
}