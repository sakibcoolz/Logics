package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AgentDao;
import in.logics.mains.model.Agent_master;
import in.logics.mains.repository.AgentMasterRepo;

@Service
public class AgentDaoImpl implements AgentDao {

	@Autowired
	AgentMasterRepo agentMasterRepo;
	
	@Override
	public Agent_master addAgents(Agent_master agentmaster) {
		// TODO Auto-generated method stub
		return agentMasterRepo.save(agentmaster);
	}

	@Override
	public List<Agent_master> getAllAgents() {
		// TODO Auto-generated method stub
		return agentMasterRepo.findAll();
	}

	@Override
	public void deleteAgents(long ids) {
		// TODO Auto-generated method stub
		agentMasterRepo.deleteAgent_masterById(ids);
	}

	@Override
	public Optional<Agent_master> getAgentsById(long ids) {
		// TODO Auto-generated method stub
		return agentMasterRepo.findById(ids);
	}

	@Override
	public Agent_master editAgentById(Agent_master agent_master) {
		// TODO Auto-generated method stub
		return agentMasterRepo.save(agent_master);
	}

	@Override
	public Agent_master getAgentByName(String forword_agent) {
		// TODO Auto-generated method stub
		return agentMasterRepo.findByName(forword_agent);
	}

}
