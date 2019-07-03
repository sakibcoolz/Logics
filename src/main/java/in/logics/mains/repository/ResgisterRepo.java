package in.logics.mains.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Register;



public interface ResgisterRepo extends MongoRepository<Register, Long>{

	Register findByUsernameAndPassword(String username, String password);

	void deleteRegisterById(long ids);

}
