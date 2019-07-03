package in.logics.mains.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Port_names;

public interface Port_Name_Repo  extends MongoRepository< Port_names, Long> {

	List<Port_names> findByCountryLike(String partname);

}
