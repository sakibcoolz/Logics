package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.CountrynameDao;
import in.logics.mains.model.Country_name;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.CountrynameService;

@Service
public class CountrynameServiceImpl implements CountrynameService {

	@Autowired
	CountrynameDao countrynameDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";

	@Override
	public Country_name addCountry(Country_name countryname) {
		// TODO Auto-generated method stub
		try {
			countryname.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countrynameDao.addCountry( countryname);
	}

	@Override
	public Country_name editCountry(Country_name countryname) {
		// TODO Auto-generated method stub
		return countrynameDao.editCountry(countryname);
	}

	@Override
	public Optional<Country_name> getCountryById(long ids) {
		// TODO Auto-generated method stub
		return countrynameDao.getCountryById( ids);
	}

	@Override
	public List<Country_name> getAllCountry() {
		// TODO Auto-generated method stub
		return countrynameDao.getAllCountry();
	}

	@Override
	public Country_name deleteCountryById(long ids) {
		// TODO Auto-generated method stub
		return countrynameDao.deleteCountryById( ids);
	}
	
	
	
}
