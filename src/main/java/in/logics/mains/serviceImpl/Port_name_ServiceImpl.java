package in.logics.mains.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.Port_name_Dao;
import in.logics.mains.model.Port_names;
import in.logics.mains.service.Port_names_Service;

@Service
public class Port_name_ServiceImpl implements Port_names_Service {

	@Autowired
	Port_name_Dao port_name_Dao;
	
	
	@Override
	public List<Port_names> getPortName(String partname) {
		return port_name_Dao.getPortName(partname);
	}

}
