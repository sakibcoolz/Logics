package in.logics.mains.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.logics.mains.model.Commudity;
import in.logics.mains.model.Country_name;
import in.logics.mains.model.DeliveryAgent;
import in.logics.mains.model.Invoice_master;
import in.logics.mains.model.NewBookings;
import in.logics.mains.model.NewItemMaster;
import in.logics.mains.model.NewStatusMaster;
import in.logics.mains.model.NotifyMaster;
import in.logics.mains.model.Port_names;
import in.logics.mains.model.User_port;
import in.logics.mains.service.AddinvoiceService;
import in.logics.mains.service.BookingService;
import in.logics.mains.service.CommudityService;
import in.logics.mains.service.CountrynameService;
import in.logics.mains.service.DeliveryAgentService;
import in.logics.mains.service.ExcelMakerService;
import in.logics.mains.service.NewItemMasterService;
import in.logics.mains.service.NewStatusMasterService;
import in.logics.mains.service.NotifyagentService;
import in.logics.mains.service.Port_names_Service;
import in.logics.mains.service.UserPortService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/logics")
public class MainOneController {
	
	@Autowired
	NotifyagentService notifyagentService;
	
	@Autowired
	CommudityService commudityService;
	
	@Autowired
	Port_names_Service port_names_Service;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	NewItemMasterService newItemMasterService;
	
	@Autowired
	AddinvoiceService addinvoiceService;
	
	@Autowired
	ExcelMakerService excelMakerService;
	
	@Autowired
	UserPortService userPortService;
	
	@Autowired
	CountrynameService countrynameService;
	
	@Autowired
	DeliveryAgentService deliveryAgentService;
	
	@Autowired
	NewStatusMasterService newStatusMasterService;
	
	@RequestMapping(value="/createNotifyAgent", method = RequestMethod.POST)
	public NotifyMaster createNotifyMaster(@RequestBody NotifyMaster notifyMaster) {
		return notifyagentService.createNotifyMaster(notifyMaster);
	}
	
	@RequestMapping(value="/getAllNotify", method=RequestMethod.GET)
	public List<NotifyMaster> getAllNotifyMaster(){
		return notifyagentService.getAllNotifyMaster();
	}
	
	@RequestMapping(value="/getNotifyAgentById/{id}", method=RequestMethod.GET)
	public Optional<NotifyMaster> getNotifyAgentMaster(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return notifyagentService.getNotifyAgentMaster(ids);
	}
	
	@RequestMapping(value="/editNotifyAgentById", method = RequestMethod.PUT)
	public NotifyMaster EditNotifyAgentByid(@RequestBody NotifyMaster notifyMaster) {
		return notifyagentService.EditNotifyAgentByid(notifyMaster);
	}
	
	
	@RequestMapping(value="/deleteNotifyAgent", method=RequestMethod.DELETE)
	private void deleteNotifyMasterParty(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		notifyagentService.deleteNotifyMasterParty(ids);
	}
	
	@RequestMapping(value="/createCommudity", method = RequestMethod.POST)
	private Commudity createCommudity(@RequestBody Commudity commudity) {
		return commudityService.createCommudity(commudity);
	}
	
	@RequestMapping(value="/getAllCommudity", method = RequestMethod.GET)
	private List<Commudity> getALLCommudity(){
		return commudityService.getALLCommudity();
	}
	
	@RequestMapping(value="/deleteCommudity", method = RequestMethod.DELETE)
	private void DeleteCommudity(@RequestParam("id") String id){
		long ids = Long.parseLong(id);
		commudityService.DeleteCommudity(ids);
	}
	
	@RequestMapping(value="/getCommudityById/{id}", method=RequestMethod.GET)
	private Optional<Commudity> getCommudityById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return commudityService.getCommudityById(ids);
	}
	
	@RequestMapping(value="/editCommudityById", method=RequestMethod.PUT)
	private Commudity editCommudityById(@RequestBody Commudity commudity) {
		return commudityService.editCommudityById(commudity);
	}
	
	
	@RequestMapping(value="/getPortName", method = RequestMethod.GET)
	private List<Port_names> getPortName(@RequestParam("portname") String partname){
		return port_names_Service.getPortName(partname);
	}
	
	
	@RequestMapping(value="/newbooking", method = RequestMethod.POST)
	private NewBookings getNewBooking(@RequestBody NewBookings newBooking ) {
		System.out.println(newBooking.toString());
		return bookingService.getNewBooking(newBooking);
	}
	
	@RequestMapping(value="/listBooking", method = RequestMethod.GET)
	private List<NewBookings> listBooking(){
		return bookingService.ListBooking();
	}
	
	@RequestMapping(value="/getBookingById", method = RequestMethod.GET)
	private Optional<NewBookings> getBookingById(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		return bookingService.getBookingById(ids);
	}
	
	@RequestMapping(value="/deleteBookingById", method = RequestMethod.DELETE)
	private void deleteBookingById(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		bookingService.deleteBookingById(ids);
	}
	
	
	
	@RequestMapping(value="/addNewItem", method = RequestMethod.POST)
	private NewItemMaster addItem(@RequestBody NewItemMaster newItemMaster ) {
		return newItemMasterService.addnewItem(newItemMaster);
	}
	
	@RequestMapping(value="/getItem", method = RequestMethod.GET)
	private List<NewItemMaster> getallItem() {
		return newItemMasterService.getallItem();
	}
	
	@RequestMapping(value="/deleteItemId", method = RequestMethod.DELETE)
	private void deleteItemId(@RequestParam("id") String id) {
		long ids = Long.parseLong(id);
		newItemMasterService.deleteItemId(ids);
	}
	
	@RequestMapping(value="/addInvoice", method = RequestMethod.POST)
	private Invoice_master addInvoice(@RequestBody Invoice_master invoice_master) {
		return addinvoiceService.AddInvoice(invoice_master);
	} 
	
	@RequestMapping(value="/editInvoice/{blno}", method = RequestMethod.GET)
	private Invoice_master editInvoice(@PathVariable("blno") String blno) {
		System.out.println("blno : "+blno);
		return addinvoiceService.editInvoice(blno);
	}
	
	@RequestMapping(value="/editedInvoice", method = RequestMethod.PUT)
	private Invoice_master editedInvoice(@RequestBody Invoice_master invoice_master) {
		return addinvoiceService.editedInvoice(invoice_master);
	}
	
	@RequestMapping(value="/downloadIn/{blno}", method = RequestMethod.GET)
	private ResponseEntity<Object> downloadFile(@PathVariable("blno") String blno) throws FileNotFoundException{
		//String FILE_NAME = "/home/sakib/excel/test.xlsx";
		String FILE_NAME = "/home/indialivingdigital/excel/test.xlsx";
		System.out.println("sakib mulla");
		XSSFWorkbook workbook = excelMakerService.InvoiceMaker(blno);
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        File file = new File(FILE_NAME);
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));		
		ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.parseMediaType("application/txt")).body(resource);
		return responseEntity;
	}
	
	@RequestMapping(value="/addPorts", method = RequestMethod.POST)
	private User_port addPorts(@RequestBody User_port user_port) {
		return userPortService.addPorts(user_port);
	}
	
	@RequestMapping(value="/EditPorts", method = RequestMethod.PUT)
	private User_port EditPorts(@RequestBody User_port user_port) {
		return userPortService.editPorts(user_port);
	}
	
	
	@RequestMapping(value="/findPortsbyId/{id}", method = RequestMethod.GET)
	private Optional<User_port> findbyPorts(@PathVariable("id") String id) {
		long ids = Long.parseLong(id);
		return userPortService.findPortsById(ids);
	}
	
	
	@RequestMapping(value="/allPorts", method = RequestMethod.GET)
	private List<User_port> findAllPorts() {
		return userPortService.allPorts();
	}
	
	@RequestMapping(value="/deletePortsById/{id}", method = RequestMethod.DELETE)
	private User_port deletePortsById(@PathVariable("id") String id) {
		Long ids = Long.parseLong(id);
		return userPortService.deletePortsById(ids);
	}
	
	
	@RequestMapping(value="/addcountry", method= RequestMethod.POST)
	private Country_name addCountry(@RequestBody Country_name countryname) {
		return countrynameService.addCountry(countryname);
	}
	
	
	@RequestMapping(value="/editcountry", method= RequestMethod.PUT)
	private Country_name editCountry(@RequestBody Country_name countryname) {
		return countrynameService.editCountry(countryname);
	}
	
	@RequestMapping(value="/getcountrybyid/{id}", method=RequestMethod.GET)
	private Optional<Country_name> getCountryById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return countrynameService.getCountryById(ids);
	}
	
	@RequestMapping(value="/getAllCountry", method=RequestMethod.GET)
	private List<Country_name> getAllCountry(){
		return countrynameService.getAllCountry();
	}
	
	@RequestMapping(value="/deletecountrybyid/{id}", method=RequestMethod.DELETE)
	private Country_name deleteCountryById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return countrynameService.deleteCountryById(ids);
	}
	
	@RequestMapping(value="/addDeliveruAgent", method= RequestMethod.POST)
	private DeliveryAgent addDeliveruAgent(@RequestBody DeliveryAgent deliveryAgent) {
		return deliveryAgentService.addDeliveruAgent(deliveryAgent);
	}
	
	@RequestMapping(value="/editDeliveruAgent", method= RequestMethod.PUT)
	private DeliveryAgent editDeliveryAgent(@RequestBody DeliveryAgent deliveryAgent) {
		return deliveryAgentService.editDeliveryAgent(deliveryAgent);
	}
	
	
	@RequestMapping(value="/getDeliveryAgentbyid/{id}", method=RequestMethod.GET)
	private Optional<DeliveryAgent> getDeliveryAgentById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return deliveryAgentService.getDeliveryAgentById(ids);
	}
	
	@RequestMapping(value="/getAllDeliveryAgent", method=RequestMethod.GET)
	private List<DeliveryAgent> getAllDeliveryAgnt(){
		return deliveryAgentService.getAllDeliveryAgnt();
	}
	
	@RequestMapping(value="/deleteDeliveryAgentbyid/{id}", method=RequestMethod.DELETE)
	private DeliveryAgent deleteDeliveryAgentById(@PathVariable("id") String id){
		long ids = Long.parseLong(id);
		return deliveryAgentService.deleteDeliveryAgentById(ids);
	}
	
	@RequestMapping(value="/addNewStatus", method=RequestMethod.POST)
	private NewStatusMaster addNewStatus(@RequestBody NewStatusMaster newStatusMaster ) {
		return newStatusMasterService.addNewStatus( newStatusMaster );
	}
	
	@RequestMapping(value="/getAllStatus", method=RequestMethod.GET)
	private List<NewStatusMaster> getAllstatus() {
		return newStatusMasterService.getAllstatus();
	}
	
	@RequestMapping(value="/deleteStatus/{id}", method=RequestMethod.DELETE)
	private NewStatusMaster deleteStatus(@PathVariable("id") String id) {
		long ids = Long.parseLong(id);
		return newStatusMasterService.deleteStatus( ids);
	}
	
}
