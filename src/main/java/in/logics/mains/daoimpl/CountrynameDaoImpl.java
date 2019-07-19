package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.CountrynameDao;
import in.logics.mains.model.Country_name;
import in.logics.mains.repository.CountrynameRepo;

@Service
public class CountrynameDaoImpl implements CountrynameDao {
	
	
	@Autowired
	CountrynameRepo countrynameRepo;

	@Override
	public Country_name addCountry(Country_name countryname) {
		// TODO Auto-generated method stub
		return countrynameRepo.save(countryname);
	}

	@Override
	public Country_name editCountry(Country_name countryname) {
		// TODO Auto-generated method stub
		return countrynameRepo.save(countryname);
	}

	@Override
	public Optional<Country_name> getCountryById(long ids) {
		// TODO Auto-generated method stub
		return countrynameRepo.findById(ids);
	}

	@Override
	public List<Country_name> getAllCountry() {
		// TODO Auto-generated method stub
		return countrynameRepo.findAll();
	}

	@Override
	public Country_name deleteCountryById(long ids) {
		// TODO Auto-generated method stub
		return countrynameRepo.deleteCountry_nameById(ids);
	}

}
