package gn.learn.springdatarest;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import gn.learn.springdatarest.ReservationRepo;


@Component
public class DummyClr implements CommandLineRunner {

	@Autowired
	ReservationRepo reservationRepo;
	
	public DummyClr(ReservationRepo reservationRepo) {
		super();
		this.reservationRepo = reservationRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Alex", "judy", "Josh","Tasha","Andrew","Bridget")
			.forEach(n -> reservationRepo.save(new Reservation(n)));
		
		reservationRepo.findAll().forEach(System.out::println);
		//reservationRepo.findByReservationName("Josh").forEach(System.out::println);
	}

}
