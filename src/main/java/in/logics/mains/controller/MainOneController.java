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
import in.logics.mains.model.Invoice_master;
import in.logics.mains.model.NewBookings;
import in.logics.mains.model.NewItemMaster;
import in.logics.mains.model.NotifyMaster;
import in.logics.mains.model.Port_names;
import in.logics.mains.service.AddinvoiceService;
import in.logics.mains.service.BookingService;
import in.logics.mains.service.CommudityService;
import in.logics.mains.service.ExcelMakerService;
import in.logics.mains.service.NewItemMasterService;
import in.logics.mains.service.NotifyagentService;
import in.logics.mains.service.Port_names_Service;

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
	
}
