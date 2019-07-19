package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Country_name;

public interface CountrynameRepo extends MongoRepository<Country_name, Long> {

	Country_name deleteCountry_nameById(long ids);

}
