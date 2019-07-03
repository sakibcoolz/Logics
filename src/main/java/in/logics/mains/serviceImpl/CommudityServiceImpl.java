package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.CommudityDao;
import in.logics.mains.model.Commudity;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.CommudityService;

@Service
public class CommudityServiceImpl implements CommudityService {

	@Autowired
	CommudityDao commudityDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";


	@Override
	public Commudity createCommudity(Commudity commudity) {
		// TODO Auto-generated method stub
		try {
			commudity.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return commudityDao.createCommudity(commudity);
	}


	@Override
	public List<Commudity> getALLCommudity() {
		// TODO Auto-generated method stub
		return commudityDao.getALLCommudity();
	}


	@Override
	public void DeleteCommudity(long ids) {
		// TODO Auto-generated method stub
		commudityDao.DeleteCommudity(ids);
	}


	@Override
	public Optional<Commudity> getCommudityById(long ids) {
		// TODO Auto-generated method stub
		return commudityDao.getCommudityById( ids);
	}


	@Override
	public Commudity editCommudityById(Commudity commudity) {
		// TODO Auto-generated method stub
		return commudityDao.editCommudityById( commudity);
	}
	
	
}
