package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Vessel_master;


public interface VesselMasterRepo extends MongoRepository<Vessel_master, Long> {

	void deleteVessel_masterById(long ids);

}
