package in.logics.mains.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Shipper_master;


public interface ShipperMasterRepo extends MongoRepository<Shipper_master, Long>{

	void deleteShipper_masterById(long ids);

	List<Shipper_master> findByNameLike(String c);
	
}
