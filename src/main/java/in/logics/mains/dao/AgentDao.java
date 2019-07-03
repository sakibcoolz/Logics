package in.logics.mains.dao;


import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Agent_master;

public interface AgentDao {

	Agent_master addAgents(Agent_master agentmaster);

	List<Agent_master> getAllAgents();

	void deleteAgents(long ids);

	Optional<Agent_master> getAgentsById(long ids);

	Agent_master editAgentById(Agent_master agent_master);

	Agent_master getAgentByName(String forword_agent);

}
