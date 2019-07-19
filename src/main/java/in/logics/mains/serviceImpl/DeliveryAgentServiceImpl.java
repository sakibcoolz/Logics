package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.DeliveryAgentDao;
import in.logics.mains.model.DeliveryAgent;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.DeliveryAgentService;

@Service
public class DeliveryAgentServiceImpl implements DeliveryAgentService {
	
	@Autowired
	DeliveryAgentDao deliveryAgentDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";

	@Override
	public DeliveryAgent addDeliveruAgent(DeliveryAgent deliveryAgent) {
		// TODO Auto-generated method stub
		try {
			deliveryAgent.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deliveryAgentDao.addDeliveruAgent( deliveryAgent);
	}

	@Override
	public DeliveryAgent editDeliveryAgent(DeliveryAgent deliveryAgent) {
		// TODO Auto-generated method stub
		return deliveryAgentDao.editDeliveryAgent( deliveryAgent);
	}

	@Override
	public Optional<DeliveryAgent> getDeliveryAgentById(long ids) {
		// TODO Auto-generated method stub
		return deliveryAgentDao.getDeliveryAgentById( ids);
	}

	@Override
	public List<DeliveryAgent> getAllDeliveryAgnt() {
		// TODO Auto-generated method stub
		return deliveryAgentDao.getAllDeliveryAgnt();
	}

	@Override
	public DeliveryAgent deleteDeliveryAgentById(long ids) {
		// TODO Auto-generated method stub
		return deliveryAgentDao.deleteDeliveryAgentById( ids);
	}
	
}
