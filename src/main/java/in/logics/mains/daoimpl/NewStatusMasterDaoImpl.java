package in.logics.mains.daoimpl;

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

}
