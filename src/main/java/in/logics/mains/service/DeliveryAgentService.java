package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.DeliveryAgent;

public interface DeliveryAgentService {

	DeliveryAgent addDeliveruAgent(DeliveryAgent deliveryAgent);

	DeliveryAgent editDeliveryAgent(DeliveryAgent deliveryAgent);

	Optional<DeliveryAgent> getDeliveryAgentById(long ids);

	List<DeliveryAgent> getAllDeliveryAgnt();

	DeliveryAgent deleteDeliveryAgentById(long ids);

}
