package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NewStatusMasterDao;
import in.logics.mains.model.NewStatusMaster;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.NewStatusMasterService;

@Service
public class NewStatusMasterServiceImpl implements NewStatusMasterService {

	@Autowired
	NewStatusMasterDao newStatusMasterDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Override
	public NewStatusMaster addNewStatus(NewStatusMaster newStatusMaster) {
		// TODO Auto-generated method stub
		try {
			newStatusMaster.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return newStatusMasterDao.addNewStatus( newStatusMaster);
	}

	@Override
	public List<NewStatusMaster> getAllstatus() {
		return newStatusMasterDao.getAllstatus();
	}

	@Override
	public NewStatusMaster deleteStatus(long ids) {
		// TODO Auto-generated method stub
		return newStatusMasterDao.deleteStatus( ids);
	}

	@Override
	public Optional<NewStatusMaster> getStatusById(long ids) {
		// TODO Auto-generated method stub
		return newStatusMasterDao.getStatusById( ids);
	}

	@Override
	public NewStatusMaster editStatus(NewStatusMaster newStatusMaster) {
		// TODO Auto-generated method stub
		return newStatusMasterDao.editStatus( newStatusMaster);
	}

}
