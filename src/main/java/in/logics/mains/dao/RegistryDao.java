package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Register;



public interface RegistryDao {

	Register LoginVerify(String username, String password);

	Register addRegister(Register register);

	List<Register> getusers();

	Optional<Register> getOneUser(long ids);

	void deleteOneUser(long ids);

	Register updateUser(Register shm);

}
