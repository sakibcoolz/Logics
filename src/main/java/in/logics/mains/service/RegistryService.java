package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Dashboard;
import in.logics.mains.model.Register;


public interface RegistryService {

	Register addRegister(Register register);

	List<Register> getusers();

	Optional<Register> getOneUser(long ids);

	void deleteOneUser(long ids);

	Register updateUser(Register shm);

	Dashboard dashboard();


}
