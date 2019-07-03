package in.logics.mains.service;


import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Agent_master;

public interface AgentService {

	Agent_master addAgents(Agent_master agentmaster);

	List<Agent_master> getAllAgents();

	void deleteAgents(long ids);

	Optional<Agent_master> getAgentsById(long ids);

	Agent_master editAgentById(Agent_master agent_master);

}
