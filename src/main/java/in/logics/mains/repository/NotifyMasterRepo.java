package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.NotifyMaster;

public interface NotifyMasterRepo extends MongoRepository<NotifyMaster, Long> {

	void deleteNotifyMasterById(long id);

	NotifyMaster findByName(String notify_agent);

}
