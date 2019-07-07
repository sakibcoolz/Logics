package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.BookingDao;
import in.logics.mains.model.NewBookings;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingDao bookingDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";

	@Override
	public NewBookings getNewBooking(NewBookings newBooking) {
		// TODO Auto-generated method stub
		try {
			newBooking.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bookingDao.getNewBooking(newBooking);
	}

	@Override
	public List<NewBookings> ListBooking() {
		// TODO Auto-generated method stub
		return bookingDao.ListBooking();
	}

	@Override
	public Optional<NewBookings> getBookingById(long ids) {
		// TODO Auto-generated method stub
		return bookingDao.getBookingById(ids);
	}

	@Override
	public void deleteBookingById(long ids) {
		// TODO Auto-generated method stub
		bookingDao.deleteBookingById( ids);
	}

	@Override
	public NewBookings getBookingByBLno(String blno) {
		// TODO Auto-generated method stub
		return bookingDao.getBookingByBlno(blno);
	}

}
