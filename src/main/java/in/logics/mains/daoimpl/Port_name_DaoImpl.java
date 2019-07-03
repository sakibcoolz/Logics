package in.logics.mains.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.Port_name_Dao;
import in.logics.mains.model.Port_names;
import in.logics.mains.repository.Port_Name_Repo;


@Service
public class Port_name_DaoImpl implements Port_name_Dao {

	@Autowired
	Port_Name_Repo port_name_Repo;
	
	@Override
	public List<Port_names> getPortName(String partname) {
		//return port_name_Repo.findByCountry_nameLike(partname);
		return port_name_Repo.findByCountryLike(partname);
	}

}
