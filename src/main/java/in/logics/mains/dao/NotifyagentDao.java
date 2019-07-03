package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.NotifyMaster;

public interface NotifyagentDao {

	NotifyMaster createNotifyMaster(NotifyMaster notifyMaster);

	List<NotifyMaster> getAllNotifyMaster();

	void getAllNotifyMaster(long id);

	Optional<NotifyMaster> getNotifyAgentMaster(long ids);

	NotifyMaster EditNotifyAgentByid(NotifyMaster notifyMaster);

	NotifyMaster getNotifyByName(String notify_agent);

}
