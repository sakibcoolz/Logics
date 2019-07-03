package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NotifyagentDao;
import in.logics.mains.model.NotifyMaster;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.NotifyagentService;

@Service
public class NotifyagentServiceImpl implements NotifyagentService {

	@Autowired
	NotifyagentDao notifyagentDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	
	public NotifyMaster createNotifyMaster(NotifyMaster notifyMaster) {
		try {
			notifyMaster.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notifyagentDao.createNotifyMaster(notifyMaster);
	}


	@Override
	public List<NotifyMaster> getAllNotifyMaster() {
		return notifyagentDao.getAllNotifyMaster();
	}


	@Override
	public void deleteNotifyMasterParty(long id) {
		notifyagentDao.getAllNotifyMaster(id);
	}


	@Override
	public Optional<NotifyMaster> getNotifyAgentMaster(long ids) {
		return notifyagentDao.getNotifyAgentMaster(ids);
	}


	@Override
	public NotifyMaster EditNotifyAgentByid(NotifyMaster notifyMaster) {
		return notifyagentDao.EditNotifyAgentByid(notifyMaster);
	}

}
