package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.DeliveryAgentDao;
import in.logics.mains.model.DeliveryAgent;
import in.logics.mains.repository.DeliveryAgentRepo;

@Service
public class DeliveryAgentDaoImpl implements DeliveryAgentDao {
	
	@Autowired
	DeliveryAgentRepo deliveryagentrepo;

	@Override
	public DeliveryAgent addDeliveruAgent(DeliveryAgent deliveryAgent) {
		// TODO Auto-generated method stub
		return deliveryagentrepo.save(deliveryAgent);
	}

	@Override
	public DeliveryAgent editDeliveryAgent(DeliveryAgent deliveryAgent) {
		// TODO Auto-generated method stub
		return deliveryagentrepo.save(deliveryAgent);
	}

	@Override
	public Optional<DeliveryAgent> getDeliveryAgentById(long ids) {
		// TODO Auto-generated method stub
		return deliveryagentrepo.findById(ids);
	}

	@Override
	public List<DeliveryAgent> getAllDeliveryAgnt() {
		// TODO Auto-generated method stub
		return deliveryagentrepo.findAll();
	}

	@Override
	public DeliveryAgent deleteDeliveryAgentById(long ids) {
		// TODO Auto-generated method stub
		return deliveryagentrepo.deleteDeliveryAgentById(ids);
	}

}
