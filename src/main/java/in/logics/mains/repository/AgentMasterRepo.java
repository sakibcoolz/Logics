package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Agent_master;


public interface AgentMasterRepo extends MongoRepository<Agent_master, Long>{

	void deleteAgent_masterById(long ids);

	Agent_master findByName(String forword_agent);
	
}
