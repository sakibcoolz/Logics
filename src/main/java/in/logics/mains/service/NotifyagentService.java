package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.NotifyMaster;

public interface NotifyagentService {

	NotifyMaster createNotifyMaster(NotifyMaster notifyMaster);

	List<NotifyMaster> getAllNotifyMaster();

	void deleteNotifyMasterParty(long id);

	Optional<NotifyMaster> getNotifyAgentMaster(long ids);

	NotifyMaster EditNotifyAgentByid(NotifyMaster notifyMaster);
	
}
