package in.logics.mains.service;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.Consignee_master;

public interface ConsigneeMasterService {

	Consignee_master addConsignee(Consignee_master consigneemaster);

	List<Consignee_master> getAllConsignee();

	void deleteConsignee(long ids);

	Optional<Consignee_master> getConsigneeById(long ids);

	Consignee_master editConsigneeById(Consignee_master consigneemaster);


}
