package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.ConsigneeMasterDao;
import in.logics.mains.model.Consignee_master;
import in.logics.mains.repository.ConsigneeMasterRepository;

@Service
public class ConsigneeMasterDaoImpl  implements ConsigneeMasterDao{

	@Autowired
	ConsigneeMasterRepository consigneeMasterRepository;
	
	@Override
	public Consignee_master addConsignee(Consignee_master consigneemaster) {
		return consigneeMasterRepository.save(consigneemaster);
	}
	
	@Override
	public List<Consignee_master> getAllConsignee() {
		// TODO Auto-generated method stub
		return consigneeMasterRepository.findAll();
	}

	@Override
	public void deleteConsignee(long ids) {
		// TODO Auto-generated method stub
		consigneeMasterRepository.deleteConsignee_masterById(ids);
	}

	@Override
	public Optional<Consignee_master> getConsigneeById(long ids) {
		// TODO Auto-generated method stub
		return consigneeMasterRepository.findById(ids);
	}

	@Override
	public Consignee_master editConsigneeById(Consignee_master consigneemaster) {
		// TODO Auto-generated method stub
		return consigneeMasterRepository.save(consigneemaster);
	}

	@Override
	public Consignee_master getConsigneeByName(String notify_agent) {
		// TODO Auto-generated method stub
		return consigneeMasterRepository.findByName(notify_agent);
	}

	@Override
	public long getConsigneeCount() {
		// TODO Auto-generated method stub
		return consigneeMasterRepository.count();
	}

}
