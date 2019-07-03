package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Shipper_master;

public interface ShipperMasterDao {

	Shipper_master addShipper(Shipper_master shm);

	List<Shipper_master> getShipper();

	void deleteShipper(long ids);

	List<Shipper_master> getLikeShipper(String c);

	Optional<Shipper_master> getshipperById(long ids);

	Shipper_master editShipper_master(Shipper_master shipper_master);

	long getCountShipper();
	
}
