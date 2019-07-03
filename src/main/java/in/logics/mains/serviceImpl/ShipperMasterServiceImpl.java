package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.ShipperMasterDao;
import in.logics.mains.model.Shipper_master;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.ShipperMasterService;

@Service
public class ShipperMasterServiceImpl implements ShipperMasterService {

	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Autowired
	private ShipperMasterDao shipperMasterDao;
	
	@Override
	public Shipper_master addshipper(Shipper_master shm) {
		try {
			shm.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return shipperMasterDao.addShipper(shm);
	}

	@Override
	public List<Shipper_master> getShipper() {
		// TODO Auto-generated method stub
		return shipperMasterDao.getShipper();
	}

	@Override
	public void deleteShipper(long ids) {
		// TODO Auto-generated method stub
		shipperMasterDao.deleteShipper(ids);
	}

	@Override
	public List<Shipper_master> getLikeShipper(String c) {
		// TODO Auto-generated method stub
		return shipperMasterDao.getLikeShipper(c);
	}

	@Override
	public Optional<Shipper_master> getshipperById(long ids) {
		return shipperMasterDao.getshipperById( ids);
	}

	@Override
	public Shipper_master editShipper_master(Shipper_master shipper_master) {
		return shipperMasterDao.editShipper_master( shipper_master);
	}

	
}
