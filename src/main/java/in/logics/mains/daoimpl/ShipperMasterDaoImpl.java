package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.ShipperMasterDao;
import in.logics.mains.model.Shipper_master;
import in.logics.mains.repository.ShipperMasterRepo;

@Service
public class ShipperMasterDaoImpl implements ShipperMasterDao {
	
	@Autowired
	private ShipperMasterRepo shipperMasterRepo;

	@Override
	public Shipper_master addShipper(Shipper_master shm) {
		return shipperMasterRepo.save(shm);
	}

	@Override
	public List<Shipper_master> getShipper() {
		// TODO Auto-generated method stub
		return shipperMasterRepo.findAll();
	}

	@Override
	public void deleteShipper(long ids) {
		// TODO Auto-generated method stub
		shipperMasterRepo.deleteShipper_masterById(ids);
	}

	@Override
	public List<Shipper_master> getLikeShipper(String c) {
		// TODO Auto-generated method stub
		return shipperMasterRepo.findByNameLike(c);
	}

	@Override
	public Optional<Shipper_master> getshipperById(long ids) {
		return shipperMasterRepo.findById(ids);
	}

	@Override
	public Shipper_master editShipper_master(Shipper_master shipper_master) {
		// TODO Auto-generated method stub
		return shipperMasterRepo.save( shipper_master);
	}

	@Override
	public long getCountShipper() {
		return shipperMasterRepo.count();
	}

}
