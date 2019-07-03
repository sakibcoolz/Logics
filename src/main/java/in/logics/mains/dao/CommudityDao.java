package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Commudity;

public interface CommudityDao {

	Commudity createCommudity(Commudity commudity);

	List<Commudity> getALLCommudity();

	void DeleteCommudity(long ids);

	Optional<Commudity> getCommudityById(long ids);

	Commudity editCommudityById(Commudity commudity);

}
