package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.NewStatusMaster;

public interface NewStatusMasterRepo extends MongoRepository<NewStatusMaster, Long> {

	NewStatusMaster deleteNewStatusMasterById(long ids);

}
