package in.logics.mains.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.logics.mains.model.Agent_master;
import in.logics.mains.model.Consignee_master;
import in.logics.mains.model.Dashboard;
import in.logics.mains.model.Register;
import in.logics.mains.model.Shipper_master;
import in.logics.mains.model.Vessel_master;
import in.logics.mains.service.AgentService;
import in.logics.mains.service.ConsigneeMasterService;
import in.logics.mains.service.RegistryService;
import in.logics.mains.service.ShipperMasterService;
import in.logics.mains.service.VesselMasterService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/logics")
public class MainController {
	
//	@Autowired
//	BranchService branchservice;
	
	@Autowired
	RegistryService registryservice;
	
	@Autowired
	ShipperMasterService shipperMasterService;
	
	@Autowired
	ConsigneeMasterService consigneeMasterService;
	
	@Autowired
	AgentService agentService;
	
	@Autowired
	VesselMasterService vesselMasterService;
		
	@RequestMapping(value="/register", method=RequestMethod.POST)
	private Register addRegister(@RequestBody Register register ) {
		System.out.println(register.toString());
		return registryservice.addRegister(register);
	}
	
	@RequestMapping(value="/getAllUser", method=RequestMethod.GET)
	private List<Register> getusers(){
		return registryservice.getusers();
	}
	
	@RequestMapping(value="/getoneuser", method=RequestMethod.GET)
	private Optional<Register> getOneUser(@RequestParam("id") String id){
		long ids = Long.parseLong(id);
		return registryservice.getOneUser(ids);
	}
	
	@RequestMapping(value="/updateuser", method=RequestMethod.PUT)
	private Register updateUser(@RequestBody Register shm) {
		System.out.println(shm.toString());
		return registryservice.updateUser(shm);
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.DELETE)
	private void deleteuser(@RequestParam("id") String id){
		long ids = Long.parseLong(id);
		registryservice.deleteOneUser(ids);
	}
	
	@RequestMapping(value="/addShipper", method=RequestMethod.POST)
	private Shipper_master addShipper(@RequestBody Shipper_master shm) {
		System.out.println(shm.toString());
		return shipperMasterService.addshipper(shm);
	}
	
	@RequestMapping(value="/getShipper", method=RequestMethod.GET)
	private List<Shipper_master> getShipper(){
		return shipperMasterService.getShipper();
	}
	
	@RequestMapping(value="/getshipperbyid/{id}", method=RequestMethod.GET)
	private Optional<Shipper_master> getshipperById(@PathVariable("id") String id) {
		long ids = Long.parseLong(id);
		return shipperMasterService.getshipperById(ids);
	}
	
	
	@RequestMapping(value="/editShipperMaster", method=RequestMethod.PUT)
	private Shipper_master editShipper_master(@RequestBody Shipper_master shipper_master) {
		return shipperMasterService.editShipper_master(shipper_master);
	}
	
	
	@RequestMapping(value="/getLikeShipper", method=RequestMethod.GET)
	private List<Shipper_master> getlikeShipper(@RequestParam("c") String c){
		System.out.println(c);
		return shipperMasterService.getLikeShipper(c);
	}
	
	@RequestMapping(value="/deleteShipper", method=RequestMethod.DELETE)
	private void deleteShipper(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		shipperMasterService.deleteShipper(ids);
	}
	
	@RequestMapping(value="/addConsignee", method=RequestMethod.POST)
	private Consignee_master addConsignee(@RequestBody Consignee_master consigneemaster) {
		return consigneeMasterService.addConsignee(consigneemaster);
	}
	
	@RequestMapping(value="/getAllConsignee", method=RequestMethod.GET)
	private List<Consignee_master> getAllConsignee(){
		return consigneeMasterService.getAllConsignee();
	}
	
	@RequestMapping(value="/deleteConsignee", method=RequestMethod.DELETE)
	private void deleteConsignee(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		consigneeMasterService.deleteConsignee(ids);
	}
	
	@RequestMapping(value="/getConsigneeById/{id}", method=RequestMethod.GET)
	private Optional<Consignee_master> getConsigneeById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return consigneeMasterService.getConsigneeById(ids);
	}
	
	@RequestMapping(value="/editConsigneeById", method=RequestMethod.PUT)
	private Consignee_master editConsigneeById(@RequestBody Consignee_master consigneemaster) {
		return consigneeMasterService.editConsigneeById(consigneemaster);
	}
	
	@RequestMapping(value="/addAgents", method=RequestMethod.POST)
	private Agent_master addAgents(@RequestBody Agent_master agentmaster){
		return agentService.addAgents(agentmaster);
	}
	
	@RequestMapping(value="/getAllAgents", method=RequestMethod.GET)
	private List<Agent_master> getAllAgents() {
		return agentService.getAllAgents();
	}
	
	@RequestMapping(value="/deleteAgents", method=RequestMethod.DELETE)
	private void deleteAgents(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		agentService.deleteAgents(ids);
	}
	
	@RequestMapping(value="/getAgentById/{id}", method=RequestMethod.GET)
	private Optional<Agent_master> getAgentsById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		System.out.println(ids);
		return agentService.getAgentsById(ids);
	}
	
	@RequestMapping(value="/editAgentById", method=RequestMethod.PUT)
	private Agent_master editAgentById(@RequestBody Agent_master agent_master) {
		System.out.println(agent_master.toString());
		return agentService.editAgentById(agent_master);
	}
	
	@RequestMapping(value="/addVessel", method=RequestMethod.POST)
	private Vessel_master addVessel(@RequestBody Vessel_master vessel_master) {
		System.out.println(vessel_master.toString());
		return vesselMasterService.addVessel(vessel_master);
	}
	
	@RequestMapping(value="/getAllVessel", method=RequestMethod.GET)
	private List<Vessel_master> getAllVessel(){
		return vesselMasterService.getAllVessel();
	}
	
	@RequestMapping(value="/deleteVessel", method=RequestMethod.DELETE)
	private void deleteVesselMaster(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		vesselMasterService.deleteVessel(ids);
	}
	
	@RequestMapping(value="/getVesselById/{id}", method=RequestMethod.GET)
	private Optional<Vessel_master> getVesselById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return vesselMasterService.getVesselById(ids);
	}
	
	@RequestMapping(value="/editVesselById", method=RequestMethod.PUT)
	private Vessel_master editVesselById(@RequestBody Vessel_master vessel_master) {
		return vesselMasterService.editVesselById(vessel_master);
	}
	
	@RequestMapping(value="/dash", method=RequestMethod.GET)
	private Dashboard dashboard() {
		return registryservice.dashboard();
	}
	
}
