package gn.learn.springdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	long id;
	
	String reservationName;

	public Reservation() {}
	
	public Reservation(String reservationName) {
		this.reservationName = reservationName;
	}
	
	public String getReservationName() {
		return reservationName;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reservationName=" + reservationName + "]";
	}
}
