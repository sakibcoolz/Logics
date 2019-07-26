package in.logics.mains.service;

import java.util.List;

import in.logics.mains.model.NewStatusMaster;

public interface NewStatusMasterService {

	NewStatusMaster addNewStatus(NewStatusMaster newStatusMaster);

	List<NewStatusMaster> getAllstatus();

	NewStatusMaster deleteStatus(long ids);
	
}
