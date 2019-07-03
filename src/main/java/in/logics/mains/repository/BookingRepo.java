package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.NewBookings;



public interface BookingRepo extends MongoRepository< NewBookings, Long> {

	void deleteNewBookingsById(long ids);

	NewBookings findByBillNo(String blno);
	
}


