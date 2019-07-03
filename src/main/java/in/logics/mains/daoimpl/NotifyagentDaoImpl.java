package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NotifyagentDao;
import in.logics.mains.model.NotifyMaster;
import in.logics.mains.repository.NotifyMasterRepo;

@Service
public class NotifyagentDaoImpl implements NotifyagentDao {
	
	@Autowired
	NotifyMasterRepo notifyMasterRepo;

	@Override
	public NotifyMaster createNotifyMaster(NotifyMaster notifyMaster) {
		// TODO Auto-generated method stub
		return notifyMasterRepo.save(notifyMaster);
	}

	@Override
	public List<NotifyMaster> getAllNotifyMaster() {
		// TODO Auto-generated method stub
		return notifyMasterRepo.findAll();
	}

	@Override
	public void getAllNotifyMaster(long id) {
		// TODO Auto-generated method stub
		notifyMasterRepo.deleteNotifyMasterById(id);
	}

	@Override
	public Optional<NotifyMaster> getNotifyAgentMaster(long ids) {
		// TODO Auto-generated method stub
		return notifyMasterRepo.findById(ids);
	}

	@Override
	public NotifyMaster EditNotifyAgentByid(NotifyMaster notifyMaster) {
		// TODO Auto-generated method stub
		return notifyMasterRepo.save(notifyMaster);
	}

	@Override
	public NotifyMaster getNotifyByName(String notify_agent) {
		// TODO Auto-generated method stub
		return notifyMasterRepo.findByName(notify_agent);
	}
	
	
	

}
