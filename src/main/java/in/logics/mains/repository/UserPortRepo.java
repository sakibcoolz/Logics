package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.User_port;

public interface UserPortRepo extends MongoRepository<User_port, Long> {

	User_port deleteUser_portById(Long id);

}
