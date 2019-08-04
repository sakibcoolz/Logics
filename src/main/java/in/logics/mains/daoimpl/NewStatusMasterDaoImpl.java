package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NewStatusMasterDao;
import in.logics.mains.model.NewStatusMaster;
import in.logics.mains.repository.NewStatusMasterRepo;

@Service
public class NewStatusMasterDaoImpl implements NewStatusMasterDao {
	
	@Autowired
	NewStatusMasterRepo newStatusMasterRepo;
	

	@Override
	public NewStatusMaster addNewStatus(NewStatusMaster newStatusMaster) {
		// TODO Auto-generated method stub
		return newStatusMasterRepo.save(newStatusMaster);
	}


	@Override
	public List<NewStatusMaster> getAllstatus() {
		// TODO Auto-generated method stub
		return newStatusMasterRepo.findAll();
	}


	@Override
	public NewStatusMaster deleteStatus(long ids) {
		// TODO Auto-generated method stub
		return newStatusMasterRepo.deleteNewStatusMasterById(ids);
	}


	@Override
	public Optional<NewStatusMaster> getStatusById(long ids) {
		// TODO Auto-generated method stub
		return newStatusMasterRepo.findById(ids);
	}


	@Override
	public NewStatusMaster editStatus(NewStatusMaster newStatusMaster) {
		// TODO Auto-generated method stub
		return newStatusMasterRepo.save(newStatusMaster);
	}

}
