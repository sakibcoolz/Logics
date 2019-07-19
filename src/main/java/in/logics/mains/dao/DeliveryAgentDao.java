package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.DeliveryAgent;

public interface DeliveryAgentDao {

	DeliveryAgent addDeliveruAgent(DeliveryAgent deliveryAgent);

	DeliveryAgent editDeliveryAgent(DeliveryAgent deliveryAgent);

	Optional<DeliveryAgent> getDeliveryAgentById(long ids);

	List<DeliveryAgent> getAllDeliveryAgnt();

	DeliveryAgent deleteDeliveryAgentById(long ids);

}
