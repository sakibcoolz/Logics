package in.logics.mains.dao;

import java.util.List;

import in.logics.mains.model.Port_names;

public interface Port_name_Dao {

	List<Port_names> getPortName(String partname);

}
