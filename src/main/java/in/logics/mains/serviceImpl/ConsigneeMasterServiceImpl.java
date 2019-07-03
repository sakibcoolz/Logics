package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.ConsigneeMasterDao;
import in.logics.mains.model.Consignee_master;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.ConsigneeMasterService;

@Service
public class ConsigneeMasterServiceImpl implements ConsigneeMasterService{
	
	@Autowired
	private ConsigneeMasterDao consigneeMasterDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Override
	public Consignee_master addConsignee(Consignee_master consigneemaster) {
		// TODO Auto-generated method stub
		try {
			consigneemaster.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consigneeMasterDao.addConsignee(consigneemaster);
	}

	@Override
	public List<Consignee_master> getAllConsignee() {
		// TODO Auto-generated method stub
		return consigneeMasterDao.getAllConsignee();
	}

	@Override
	public void deleteConsignee(long ids) {
		// TODO Auto-generated method stub
		 consigneeMasterDao.deleteConsignee(ids);
	}

	@Override
	public Optional<Consignee_master> getConsigneeById(long ids) {
		return consigneeMasterDao.getConsigneeById(ids);
	}

	@Override
	public Consignee_master editConsigneeById(Consignee_master consigneemaster) {
		// TODO Auto-generated method stub
		return consigneeMasterDao.editConsigneeById(consigneemaster);
	}
}
