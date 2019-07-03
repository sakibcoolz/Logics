package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.NewItemMaster;


public interface NewItemRepo extends MongoRepository<NewItemMaster , Long>{

	void deleteNewItemMasterById(long ids);

	

}
