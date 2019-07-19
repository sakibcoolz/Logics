package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.UserPortDao;
import in.logics.mains.model.User_port;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.UserPortService;

@Service
public class userPortServiceImpl implements UserPortService {

	@Autowired
	UserPortDao userPortDao;

	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Override
	public User_port addPorts(User_port user_port) {
		// TODO Auto-generated method stub
		try {
			user_port.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userPortDao.addPorts( user_port);
	}

	@Override
	public User_port editPorts(User_port user_port) {
		// TODO Auto-generated method stub
		return userPortDao.editPorts( user_port);
	}

	@Override
	public Optional<User_port> findPortsById(Long ids) {
		// TODO Auto-generated method stub
		return userPortDao.findPortsById( ids);
	}

	@Override
	public List<User_port> allPorts() {
		// TODO Auto-generated method stub
		return userPortDao.allPorts();
	}

	@Override
	public User_port deletePortsById(Long id) {
		// TODO Auto-generated method stub
		return userPortDao.deletePortsById( id);
	}
	
}
