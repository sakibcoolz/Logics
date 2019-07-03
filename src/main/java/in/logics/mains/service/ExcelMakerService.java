package in.logics.mains.service;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public interface ExcelMakerService {

	XSSFWorkbook InvoiceMaker(String blno);

}
