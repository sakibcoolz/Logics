package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.NewBookings;


public interface BookingDao {

	NewBookings getNewBooking(NewBookings newBooking);

	List<NewBookings> ListBooking();

	Optional<NewBookings> getBookingById(long ids);

	void deleteBookingById(long ids);

	NewBookings getBookingByBlno(String blno);

	long getbookingCount();

}
