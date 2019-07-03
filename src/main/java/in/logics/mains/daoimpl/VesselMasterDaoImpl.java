package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.VesselMasterDao;
import in.logics.mains.model.Vessel_master;
import in.logics.mains.repository.VesselMasterRepo;

@Service
public class VesselMasterDaoImpl implements VesselMasterDao {

	@Autowired
	VesselMasterRepo vesselMasterRepo;
	@Override
	public Vessel_master addVessel(Vessel_master vessel_master) {
		// TODO Auto-generated method stub
		return vesselMasterRepo.save(vessel_master);
	}
	
	
	@Override
	public List<Vessel_master> getAllVessel() {
		// TODO Auto-generated method stub
		return vesselMasterRepo.findAll();
	}


	@Override
	public void deleteVessel(long ids) {
		vesselMasterRepo.deleteVessel_masterById(ids);
	}


	@Override
	public Optional<Vessel_master> getVesselById(long ids) {
		// TODO Auto-generated method stub
		return vesselMasterRepo.findById(ids);
	}


	@Override
	public Vessel_master editVesselById(Vessel_master vessel_master) {
		// TODO Auto-generated method stub
		return vesselMasterRepo.save(vessel_master);
	}

}
