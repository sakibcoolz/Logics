package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Country_name;

public interface CountrynameDao {

	Country_name addCountry(Country_name countryname);

	Country_name editCountry(Country_name countryname);

	Optional<Country_name> getCountryById(long ids);

	List<Country_name> getAllCountry();

	Country_name deleteCountryById(long ids);

}
