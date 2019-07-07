package in.logics.mains.service;

import java.util.List;
import java.util.Optional;


import in.logics.mains.model.NewBookings;

public interface BookingService {

	NewBookings getNewBooking(NewBookings newBooking);

	List<NewBookings> ListBooking();

	Optional<NewBookings> getBookingById(long ids);

	void deleteBookingById(long ids);

	NewBookings getBookingByBLno(String blno);

}
