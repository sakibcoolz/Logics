package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.RegistryDao;
import in.logics.mains.model.Register;
import in.logics.mains.repository.ResgisterRepo;



@Service
public class RegisterDaoImpl implements RegistryDao{
	
	@Autowired
	ResgisterRepo registers;
	

	@Override
	public Register LoginVerify(String username, String password) {
		System.out.println("step 1 in login");
		return registers.findByUsernameAndPassword(username, password);
	}


	@Override
	public Register addRegister(Register register) {
		return registers.save(register);
	}


	@Override
	public List<Register> getusers() {
		return registers.findAll();
	}


	@Override
	public Optional<Register> getOneUser(long ids) {
		return registers.findById(ids);
	}


	@Override
	public void deleteOneUser(long ids) {
		// TODO Auto-generated method stub
		registers.deleteRegisterById(ids);
	}


	@Override
	public Register updateUser(Register shm) {
		return registers.save(shm);
	}



}
