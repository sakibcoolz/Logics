package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Vessel_master;

public interface VesselMasterService {

	Vessel_master addVessel(Vessel_master vessel_master);

	List<Vessel_master> getAllVessel();

	void deleteVessel(long ids);

	Optional<Vessel_master> getVesselById(long ids);

	Vessel_master editVesselById(Vessel_master vessel_master);

}
