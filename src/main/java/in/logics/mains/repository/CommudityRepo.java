package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Commudity;


public interface CommudityRepo extends MongoRepository< Commudity, Long> {

	void deleteCommudityById(long ids);

}
