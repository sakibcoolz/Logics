package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.NewStatusMaster;

public interface NewStatusMasterDao {

	NewStatusMaster addNewStatus(NewStatusMaster newStatusMaster);

	List<NewStatusMaster> getAllstatus();

	NewStatusMaster deleteStatus(long ids);

	Optional<NewStatusMaster> getStatusById(long ids);

	NewStatusMaster editStatus(NewStatusMaster newStatusMaster);

}
