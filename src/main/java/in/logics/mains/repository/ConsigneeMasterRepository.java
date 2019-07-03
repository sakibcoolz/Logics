package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Consignee_master;

public interface ConsigneeMasterRepository extends MongoRepository<Consignee_master, Long> {

	void deleteConsignee_masterById(long ids);

	Consignee_master findByName(String notify_agent);

}
