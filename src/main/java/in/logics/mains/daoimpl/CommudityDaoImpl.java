package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.CommudityDao;
import in.logics.mains.model.Commudity;
import in.logics.mains.repository.CommudityRepo;

@Service
public class CommudityDaoImpl implements CommudityDao {
	
	@Autowired
	CommudityRepo commudityrepo;

	@Override
	public Commudity createCommudity(Commudity commudity) {
		// TODO Auto-generated method stub
		return commudityrepo.save( commudity);
	}

	@Override
	public List<Commudity> getALLCommudity() {
		// TODO Auto-generated method stub
		return commudityrepo.findAll();
	}

	@Override
	public void DeleteCommudity(long ids) {
		// TODO Auto-generated method stub
		commudityrepo.deleteCommudityById(ids);
	}

	@Override
	public Optional<Commudity> getCommudityById(long ids) {
		// TODO Auto-generated method stub
		return commudityrepo.findById( ids);
	}

	@Override
	public Commudity editCommudityById(Commudity commudity) {
		// TODO Auto-generated method stub
		return commudityrepo.save(commudity);
	}

}
