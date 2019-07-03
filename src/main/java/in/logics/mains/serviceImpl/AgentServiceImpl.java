package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AgentDao;
import in.logics.mains.model.Agent_master;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService {

	@Autowired
	AgentDao agentDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	@Override
	public Agent_master addAgents(Agent_master agentmaster) {
		try {
			agentmaster.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return agentDao.addAgents(agentmaster);
	}

	@Override
	public List<Agent_master> getAllAgents() {
		// TODO Auto-generated method stub
		return agentDao.getAllAgents();
	}

	@Override
	public void deleteAgents(long ids) {
		agentDao.deleteAgents(ids);
	}

	@Override
	public Optional<Agent_master> getAgentsById(long ids) {
		// TODO Auto-generated method stub
		return agentDao.getAgentsById( ids);
	}

	@Override
	public Agent_master editAgentById(Agent_master agent_master) {
		// TODO Auto-generated method stub
		return agentDao.editAgentById( agent_master);
	}

}
