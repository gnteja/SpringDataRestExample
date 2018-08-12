package gn.learn.springdatarest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import gn.learn.springdatarest.ReservationRepo;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationRepo reservationRepo;

	
	@GetMapping(value ="/reservations")
	Collection<Reservation> getReservations(){
		return this.reservationRepo.findAll();
	}
}
