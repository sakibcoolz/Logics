package in.logics.mains.serviceImpl;


import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AddInvoiceDao;
import in.logics.mains.dao.AgentDao;
import in.logics.mains.dao.BookingDao;
import in.logics.mains.dao.ConsigneeMasterDao;
import in.logics.mains.dao.NotifyagentDao;
import in.logics.mains.model.Agent_master;
import in.logics.mains.model.Consignee_master;
import in.logics.mains.model.FreightAdditional;
import in.logics.mains.model.FrieghtCharges;
import in.logics.mains.model.Invoice_master;
import in.logics.mains.model.NewBookings;
import in.logics.mains.model.NotifyMaster;
import in.logics.mains.service.ExcelMakerService;

@Service
public class InvoiceMakerImpl implements ExcelMakerService {

	@Autowired
	AddInvoiceDao addInvoiceDao;
	
	@Autowired
	AgentDao agentDao;
	
	@Autowired
	NotifyagentDao notifyDao;
	
	@Autowired
	ConsigneeMasterDao consigneemaster;
	
	@Autowired
	BookingDao bookingDao;
	
	@Override
	public XSSFWorkbook InvoiceMaker(String blno) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("HHLogistics Invoice");
		sheet.getPrintSetup().setPaperSize(PrintSetup.A4_PAPERSIZE);
		sheet.setMargin(Sheet.TopMargin, 0.0 /* inches */ );
		sheet.setMargin(Sheet.LeftMargin, 0.0 /* inches */ );
		sheet.setMargin(Sheet.RightMargin, 0.0 /* inches */ );
		sheet.setMargin(Sheet.BottomMargin, 0.0 /* inches */ );
		
		
		//print margin
		XSSFPrintSetup printSetup = (XSSFPrintSetup) sheet.getPrintSetup();
	    printSetup.setHeaderMargin(0);
	    printSetup.setFooterMargin(0);
		
		//header font  
		XSSFFont headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 25);
		
		//header font style
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
		headerStyle.setFont(headerFont);
		headerStyle.setAlignment(HorizontalAlignment.CENTER);
		
		//row0
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(2);
		cell.setCellValue("H&H LOGISTICS CO.,LIMITED");
		cell.setCellStyle(headerStyle);
		sheet.addMergedRegion(new CellRangeAddress(0,0,2,9));
		
		//address font  
		XSSFFont addressFont =  workbook.createFont();
		addressFont.setFontHeightInPoints((short) 10);
				
		//address font style
		CellStyle addressStyle = workbook.createCellStyle();
		addressStyle.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
		addressStyle.setFont(addressFont);
		addressStyle.setWrapText(true); 
		addressStyle.setAlignment(HorizontalAlignment.CENTER);
		
		//row1
		Row addressRow = sheet.createRow(1);
		addressRow.setHeightInPoints(40);
		Cell addrescell = addressRow.createCell(2);
		addrescell.setCellValue("1205, 12/F, TAI SANG BANK BLDG, 130-132 DES, VOEUX ROAD, CENTRAL, HONG KONG\r\n" + 
				"Email Id : support@hhlogisticsgroup.com                             Contact No. +186 7644 0927 \r\n" + 
				"Web Site : www.hhlogisticsgroup.com");
		addrescell.setCellStyle(addressStyle);
//		addrescell.getRow().setHeight((short) 30.00);
		sheet.addMergedRegion(new CellRangeAddress(1,1,2,9));
		
		//############################################################3
		//forwording font
		XSSFFont forwordAgentFontheader = workbook.createFont();
		forwordAgentFontheader.setFontHeightInPoints((short) 10);
		
		//forwording font style
		CellStyle forwordAgentStyle = workbook.createCellStyle();
		forwordAgentStyle.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
		forwordAgentStyle.setFont(addressFont);
		forwordAgentStyle.setWrapText(true); 
		forwordAgentStyle.setAlignment(HorizontalAlignment.CENTER);
		forwordAgentStyle.setBorderBottom(BorderStyle.THICK);
		forwordAgentStyle.setBorderRight(BorderStyle.THICK);
		forwordAgentStyle.setBorderTop(BorderStyle.THICK);
		forwordAgentStyle.setBorderLeft(BorderStyle.THICK);
		
		//row2
		Row forwordAgentrow = sheet.createRow(2);
		Cell forAgentcell = forwordAgentrow.createCell(0);
		Cell forAgentcell1 = forwordAgentrow.createCell(1);
		Cell forAgentcell2 = forwordAgentrow.createCell(2);
		Cell forAgentcell3 = forwordAgentrow.createCell(3);
		Cell forAgentcell4 = forwordAgentrow.createCell(4);
		forAgentcell.setCellValue("Shipping Agent / Forwarding Agent");	
		CellRangeAddress cellrenge = new CellRangeAddress(2,2,0,4);
		forAgentcell.setCellStyle(forwordAgentStyle);
		forAgentcell1.setCellStyle(forwordAgentStyle);
		forAgentcell2.setCellStyle(forwordAgentStyle);
		forAgentcell3.setCellStyle(forwordAgentStyle);
		forAgentcell4.setCellStyle(forwordAgentStyle);
		sheet.addMergedRegion(cellrenge);
		
		Cell commercial = forwordAgentrow.createCell(6);
		Cell commercial7 = forwordAgentrow.createCell(7);
		Cell commercial8 = forwordAgentrow.createCell(8);
		Cell commercial9 = forwordAgentrow.createCell(9);
		commercial.setCellValue("Commercial Invoice");
		CellRangeAddress commer = new CellRangeAddress(2,2,6,9);
		sheet.addMergedRegion(commer);
		commercial.setCellStyle(forwordAgentStyle);
		commercial7.setCellStyle(forwordAgentStyle);
		commercial8.setCellStyle(forwordAgentStyle);
		commercial9.setCellStyle(forwordAgentStyle);
		
		//###################################################
		Invoice_master invoicemaster = addInvoiceDao.editInvoice(blno);
		System.out.println(invoicemaster.toString());
		Agent_master agentmaster = agentDao.getAgentByName(invoicemaster.getForword_agent());
		System.out.println(agentmaster.toString());
		NotifyMaster notifymaster = notifyDao.getNotifyByName(invoicemaster.getNotify_agent());
		System.out.println(notifymaster.toString());
		NewBookings booking = bookingDao.getBookingByBlno(blno);
		System.out.println(booking.toString());
		Consignee_master consignee = consigneemaster.getConsigneeByName(booking.getConsignee());
		System.out.println(consignee.toString());
		//###################################################
		
		//row3 style
		CellStyle forwordAgentStyle1 = workbook.createCellStyle();
		forwordAgentStyle1.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
		forwordAgentStyle1.setFont(addressFont);
		forwordAgentStyle1.setWrapText(true);	
		
		//row3
		Row row3 = sheet.createRow(3);
		Cell agentCell = row3.createCell(0);
		agentCell.setCellValue(agentmaster.getName());
		CellRangeAddress agentname = new CellRangeAddress(3,3,0,4);
		sheet.addMergedRegion(agentname);
		Row agentrow1 = sheet.createRow(4);
		Cell agentCell1 = agentrow1.createCell(0);
		agentCell1.setCellStyle(forwordAgentStyle1);
		
		
		
		Cell cell6 = row3.createCell(6);
		Cell cell8 = row3.createCell(8);
		cell6.setCellValue("Invoice No:");
		cell8.setCellValue(invoicemaster.getReceipt_no());
		CellRangeAddress crm = new CellRangeAddress(3,3,6,7);
		sheet.addMergedRegion(crm);
		CellRangeAddress crm1 = new CellRangeAddress(3,3,8,9);
		sheet.addMergedRegion(crm1);
		
		Row row4 = sheet.createRow(4);
		Cell rcell1 = row4.createCell(0);
		rcell1.setCellValue(agentmaster.getAddress1());
		rcell1.setCellStyle(forwordAgentStyle1);
		CellRangeAddress agentna = new CellRangeAddress(4,6,0,4);
		sheet.addMergedRegion(agentna);
		
		
		Cell rcell6 = row4.createCell(6);
		Cell rcell8 = row4.createCell(8);
		rcell6.setCellValue("Invoice Date:");
		rcell8.setCellValue(invoicemaster.getReceipt_date());
		CellRangeAddress crm4 = new CellRangeAddress(4,4,6,7);
		sheet.addMergedRegion(crm4);
		CellRangeAddress crm44 = new CellRangeAddress(4,4,8,9);
		sheet.addMergedRegion(crm44);
		
		Row row5 = sheet.createRow(5);
		Cell rcell56 = row5.createCell(6);
		Cell rcell58 = row5.createCell(8);
		rcell56.setCellValue("Customer Code:");
		rcell58.setCellValue(invoicemaster.getCustomer_code());
		CellRangeAddress crm56 = new CellRangeAddress(5,5,6,7);
		sheet.addMergedRegion(crm56);
		CellRangeAddress crm58 = new CellRangeAddress(5,5,8,9);
		sheet.addMergedRegion(crm58);
		
		//##########################################################
		//table starts here 
		Row row8 = sheet.createRow(8);
		Cell cell80 = row8.createCell(0);
		Cell cell81 = row8.createCell(1);
		Cell cell82 = row8.createCell(2);
		Cell cell83 = row8.createCell(3);
		Cell cell84 = row8.createCell(4);
		cell80.setCellValue("Notify Agent/Shipping Agent-Routing & Instructions");
		CellRangeAddress crm5 = new CellRangeAddress(8,8,0,4);
		cell80.setCellStyle(forwordAgentStyle);
		cell81.setCellStyle(forwordAgentStyle);
		cell82.setCellStyle(forwordAgentStyle);
		cell83.setCellStyle(forwordAgentStyle);
		cell84.setCellStyle(forwordAgentStyle);
		sheet.addMergedRegion(crm5);
		
		Cell cell86 = row8.createCell(6);
		Cell cell87 = row8.createCell(7);
		Cell cell88 = row8.createCell(8);
		Cell cell89 = row8.createCell(9);
		cell86.setCellValue("Notify Consignee");
		CellRangeAddress crm86 = new CellRangeAddress(8,8,6,9);
		cell86.setCellStyle(forwordAgentStyle);
		cell87.setCellStyle(forwordAgentStyle);
		cell88.setCellStyle(forwordAgentStyle);
		cell89.setCellStyle(forwordAgentStyle);
		sheet.addMergedRegion(crm86);
		//##########################################################
		Row row9 = sheet.createRow(9);
		Cell cell90 = row9.createCell(0);
		cell90.setCellValue("gcbcbvcbvhjgh "
				+ "hfhgfhg ");
		CellRangeAddress crm90 = new CellRangeAddress(9,12,0,4); 
		sheet.addMergedRegion(crm90);
		cell90.setCellStyle(forwordAgentStyle1);
		
		Cell cell96 = row9.createCell(6);
		cell96.setCellValue("sdfsd fsdf sdf sd fsd fsd sdf sdf s fs"
				+ "sdfsdfsdfsdf"
				+ " ffsd");
		CellRangeAddress crm96 = new CellRangeAddress(9,12,6,9); 
		sheet.addMergedRegion(crm96);
		cell96.setCellStyle(forwordAgentStyle1);
		
		//##########################################################
		Row row13 = sheet.createRow(14);
		Cell rcell80 = row13.createCell(0);
		Cell rcell83 = row13.createCell(3);
		Cell rcell85 = row13.createCell(5);
		Cell rcell86 = row13.createCell(6);
		Cell rcell87 = row13.createCell(7);
		Cell rcell88 = row13.createCell(8);
		Cell rcell89 = row13.createCell(9);
		rcell80.setCellValue("Perticular");
		rcell83.setCellValue("Items");
		rcell85.setCellValue("Quantity / Weight");
		rcell86.setCellValue("Unit");
		rcell87.setCellValue("Unit Price");
		rcell88.setCellValue("Amount");
		rcell89.setCellValue("Amount Total");
		CellRangeAddress crm802 = new CellRangeAddress(14,14,0,2);
		sheet.addMergedRegion(crm802);
		CellRangeAddress crm834 = new CellRangeAddress(14,14,3,4);
		sheet.addMergedRegion(crm834);
		
//		//###########################################################
		Row row15 = sheet.createRow(15);
		Cell c1 = row15.createCell(0);
		c1.setCellValue(invoicemaster.getParticulars());
		c1.setCellStyle(forwordAgentStyle1);
		CellRangeAddress commudity = new CellRangeAddress(15,44,0,2);
		sheet.addMergedRegion(commudity);
		
		Cell cell143 = row15.createCell(3);
		Cell cell149 = row15.createCell(9);
		cell143.setCellValue("Freight Charges");
		cell149.setCellValue(invoicemaster.getTotalsffc());
		CellRangeAddress crm803 = new CellRangeAddress(15,15,3,8);
		sheet.addMergedRegion(crm803);
//		//###########################################################
		int k = 40;
		int start = 16;
		int adl = 0;
		List<FrieghtCharges> affc = invoicemaster.getAffc();
		List<FreightAdditional> adlc = invoicemaster.getAdlc();
		
		for (FrieghtCharges affcs : affc) {
				Row row2to40 = sheet.createRow(start);
				Cell rcell = row2to40.createCell(3);
				Cell affcell5 = row2to40.createCell(5);
				Cell affcell6 = row2to40.createCell(6);
				Cell affcell7 = row2to40.createCell(7);
				Cell affcell8 = row2to40.createCell(8);
				Cell affcell9 = row2to40.createCell(9);
				rcell.setCellValue(affcs.getAffcchargesitems());
				affcell5.setCellValue(affcs.getAffQty());
				affcell6.setCellValue(affcs.getAffkgs());
				affcell7.setCellValue(affcs.getAffunitPrice());
				affcell8.setCellValue(affcs.getAff_amt_usd1());
				affcell9.setCellValue("");
				CellRangeAddress crms = new CellRangeAddress(start,start,3,4);
				sheet.addMergedRegion(crms);
				start++;
				adl = start;
		}
//		
//		//##################################################################
//		// adlc 
		Row rowadlc = sheet.createRow(adl);
		rowadlc.createCell(3).setCellValue("Additional Freight Charges");
		rowadlc.createCell(9).setCellValue(invoicemaster.getTotaladlcc());
		CellRangeAddress crmsadlc = new CellRangeAddress(adl,adl,3,8);
		sheet.addMergedRegion(crmsadlc);
		adl++;
//		//##################################################################
		for (FreightAdditional freightAdditional : adlc) {
			Row adlcrow = sheet.createRow(adl);
			Cell adlcitems = adlcrow.createCell(3);
			Cell adlcell5 = adlcrow.createCell(5);
			Cell adlcell6 = adlcrow.createCell(6);
			Cell adlcell7 = adlcrow.createCell(7);
			Cell adlcell8 = adlcrow.createCell(8);
			Cell adlcell9 = adlcrow.createCell(9);
			adlcitems.setCellValue(freightAdditional.getAdlCharges());
			adlcell5.setCellValue(freightAdditional.getAdlqty());
			adlcell6.setCellValue(freightAdditional.getAdlkgs());
			adlcell7.setCellValue(freightAdditional.getAdlUnit());
			adlcell8.setCellValue(freightAdditional.getAdlAmt1());
			adlcell9.setCellValue("");
			CellRangeAddress adlcrms = new CellRangeAddress(adl,adl,3,4);
			sheet.addMergedRegion(adlcrms);
			adl++;
		}
//		
//		//###################################################################
//		//row 38
		Row row45 = sheet.createRow(45);
		Cell cell380 = row45.createCell(0);
		cell380.setCellValue("sdadsasafsadsafsadsaafdsaddsasadfsafdsafds \n \r "
				+ "adsadsafsdafdsa");
		Cell cell388 = row45.createCell(8);
		cell388.setCellValue("Total");
		Cell cell389 = row45.createCell(9);
		cell389.setCellValue(invoicemaster.getTotalCharges());
		CellRangeAddress cra380 = new CellRangeAddress(45, 45, 0, 6);
		sheet.addMergedRegion(cra380);
//		//###################################################################
//		//row 39
		Row row46 = sheet.createRow(46);
		Cell cell390 = row46.createCell(0);
		cell390.setCellValue("Mode & Term of Payments : T/T & 30 Days");
		CellRangeAddress cra390 = new CellRangeAddress(46, 46, 0, 6);
		sheet.addMergedRegion(cra390);
//		//###################################################################
		Row row47 = sheet.createRow(47);
		Cell cell400 = row47.createCell(0);
		cell400.setCellValue("Payment Instruction");
		CellRangeAddress cra400 = new CellRangeAddress(47, 47, 0, 6);
		sheet.addMergedRegion(cra400);
//		//###################################################################
		Row row48 = sheet.createRow(48);
		Cell cell410 = row48.createCell(0);
		cell410.setCellValue("Beneficiary Account Name : H&H LOGISTICS CO., LIMITED");
		CellRangeAddress cra410 = new CellRangeAddress(48, 48, 0, 6);
		sheet.addMergedRegion(cra410);
//		//###################################################################
		Row row42 = sheet.createRow(49);
		Cell cell420 = row42.createCell(0);
		cell420.setCellValue("Beneficiary AC NO.: 370-375016-883");
		CellRangeAddress cra420 = new CellRangeAddress(49, 49, 0, 6);
		sheet.addMergedRegion(cra420);
//		//###################################################################
		Row row43 = sheet.createRow(50);
		Cell cell430 = row43.createCell(0);
		cell430.setCellValue("Beneficiary's BANK : HANG SENG BANK LIMITED");
		CellRangeAddress cra430 = new CellRangeAddress(50, 50, 0, 6);
		sheet.addMergedRegion(cra430);
//		//###################################################################
		Row row44 = sheet.createRow(51);
		Cell cell440 = row44.createCell(0);
		cell440.setCellValue("SWIFT CODE : HASEHKHH");
		CellRangeAddress cra440 = new CellRangeAddress(51, 51, 0, 6);
		sheet.addMergedRegion(cra440);
//		//###################################################################
		XSSFFont discriptions = workbook.createFont();
		discriptions.setFontHeightInPoints((short) 5);
		
		CellStyle discriptionstyle = workbook.createCellStyle();
		discriptionstyle.setFont(discriptions);
		discriptionstyle.setWrapText(true); 
		
		Row row52 = sheet.createRow(52);
		Cell cell450 = row52.createCell(0);
		cell450.setCellValue("Term and Conditions : All charges are payable in US Dollars and are due and payable thirty (30) days from the date of billing,"
				+ " and any payment which is past due shall be subject to an additional charge   at the rate of 1-1/2% per month of the average outstanding "
				+ "balance due, or the highest rate of interest permitted by applicable law, whichever is less. All funds received by the Broker will be "
				+ "applied to the oldest (based on pick-up date) invoiced Bill of Lading that is outstanding. Overpayments do not accrue interest and are "
				+ "subject to the Law of the Hong Kong. In the event the Broker retains an attorney or collection agency to collect unpaid charges or for "
				+ "the enforcement of these TERMS AND CONDITIONS, all unpaid charges will be subject to a late payment penalty of 33% and Customer shall "
				+ "also be liable for all attorneys and collection agency fees incurred, together with related costs and expenses. Certified that the "
				+ "particulars given above are true and correct and the amount indicated.");
		cell450.setCellStyle(discriptionstyle);
		CellRangeAddress cra450 = new CellRangeAddress(52, 54, 0, 9);
		sheet.addMergedRegion(cra450);
//		//###################################################################
		Row row55 = sheet.createRow(55);
		Cell cell480 = row55.createCell(0);
		cell480.setCellValue("Remarks: ");
		CellRangeAddress cra480 = new CellRangeAddress(55, 55, 0, 9);
		sheet.addMergedRegion(cra480);
//		
		//sheet.addMergedRegion(new CellRangeAddress(frstRow, lastRow, firstColumnIndex, lastColumnIndex));
		return workbook;
	}

}
