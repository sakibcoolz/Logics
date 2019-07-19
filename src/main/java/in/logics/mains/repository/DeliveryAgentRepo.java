package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.DeliveryAgent;

public interface DeliveryAgentRepo extends MongoRepository<DeliveryAgent, Long> {

	DeliveryAgent deleteDeliveryAgentById(long ids);

	
}
