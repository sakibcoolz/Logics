package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.BookingDao;
import in.logics.mains.model.NewBookings;
import in.logics.mains.repository.BookingRepo;

@Service
public class BookingDaoImpl implements BookingDao {

	@Autowired
	BookingRepo bookingRepo;
	
	@Override
	public NewBookings getNewBooking(NewBookings newBooking) {
		return bookingRepo.save(newBooking);
	}

	@Override
	public List<NewBookings> ListBooking() {
		// TODO Auto-generated method stub
		return bookingRepo.findAll();
	}

	@Override
	public Optional<NewBookings> getBookingById(long ids) {
		// TODO Auto-generated method stub
		return bookingRepo.findById(ids);
	}

	@Override
	public void deleteBookingById(long ids) {
		// TODO Auto-generated method stub
		bookingRepo.deleteNewBookingsById(ids);
	}

	@Override
	public NewBookings getBookingByBlno(String blno) {
		// TODO Auto-generated method stub
		return bookingRepo.findByBillNo(blno);
	}

	@Override
	public long getbookingCount() {
		// TODO Auto-generated method stub
		return bookingRepo.count();
	}

}
