package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.VesselMasterDao;
import in.logics.mains.model.Routess;
import in.logics.mains.model.Vessel_master;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.VesselMasterService;

@Service
public class VesselMasterServiceImpl implements VesselMasterService{
	
	@Autowired
	VesselMasterDao vesselMasterDao;

	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Override
	public Vessel_master addVessel(Vessel_master vessel_master) {
		try {
			vessel_master.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
//			List<Routess> r = vessel_master.getRoutess();
////			for (int i = 0; i < r.size(); i++) {
////				r.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
////			}
//			for (Routess routess : r) {
//				routess.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
//			}
//			vessel_master.setRoutess(r);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vesselMasterDao.addVessel(vessel_master);
	}

	@Override
	public List<Vessel_master> getAllVessel() {
		// TODO Auto-generated method stub
		return vesselMasterDao.getAllVessel();
	}

	@Override
	public void deleteVessel(long ids) {
		vesselMasterDao.deleteVessel(ids);
	}

	@Override
	public Optional<Vessel_master> getVesselById(long ids) {
		// TODO Auto-generated method stub
		return vesselMasterDao.getVesselById( ids);
	}

	@Override
	public Vessel_master editVesselById(Vessel_master vessel_master) {
		// TODO Auto-generated method stub
		return vesselMasterDao.editVesselById( vessel_master);
	}
	

}
