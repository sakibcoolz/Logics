package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.UserPortDao;
import in.logics.mains.model.User_port;
import in.logics.mains.repository.UserPortRepo;

@Service
public class UserPortDaoImpl implements UserPortDao {

	@Autowired
	UserPortRepo userPortRepo;

	@Override
	public User_port addPorts(User_port user_port) {
		// TODO Auto-generated method stub
		return userPortRepo.save(user_port);
	}

	@Override
	public User_port editPorts(User_port user_port) {
		// TODO Auto-generated method stub
		return userPortRepo.save(user_port);
	}

	@Override
	public Optional<User_port> findPortsById(Long ids) {
		// TODO Auto-generated method stub
		return userPortRepo.findById(ids);
	}

	@Override
	public List<User_port> allPorts() {
		// TODO Auto-generated method stub
		return userPortRepo.findAll();
	}

	@Override
	public User_port deletePortsById(Long id) {
		// TODO Auto-generated method stub
		return userPortRepo.deleteUser_portById(id);
	}
	
	
}

