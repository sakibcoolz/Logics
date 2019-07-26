package in.logics.mains.dao;

import java.util.List;

import in.logics.mains.model.NewStatusMaster;

public interface NewStatusMasterDao {

	NewStatusMaster addNewStatus(NewStatusMaster newStatusMaster);

	List<NewStatusMaster> getAllstatus();

	NewStatusMaster deleteStatus(long ids);

}
