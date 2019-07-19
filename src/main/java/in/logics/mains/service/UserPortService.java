package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.User_port;

public interface UserPortService {

	User_port addPorts(User_port user_port);

	User_port editPorts(User_port user_port);

	Optional<User_port> findPortsById(Long ids);

	List<User_port> allPorts();

	User_port deletePortsById(Long id);

}
