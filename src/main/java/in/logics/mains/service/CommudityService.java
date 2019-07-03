package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Commudity;

public interface CommudityService {

	Commudity createCommudity(Commudity commudity);

	List<Commudity> getALLCommudity();

	void DeleteCommudity(long ids);

	Optional<Commudity> getCommudityById(long ids);

	Commudity editCommudityById(Commudity commudity);

}
