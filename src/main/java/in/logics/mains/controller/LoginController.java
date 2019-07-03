package in.logics.mains.controller;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
import org.springframework.web.bind.annotation.RestController;

import in.logics.mains.model.LoginClient;
import in.logics.mains.model.Register;
import in.logics.mains.model.ValidLogins;
import in.logics.mains.service.ExcelMakerService;
import in.logics.mains.service.LoginService;
import in.logics.mains.service.RegistryService;




@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	RegistryService registryservice;
	
	@Autowired
	ExcelMakerService excelMakerService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	private ValidLogins logins(@RequestBody LoginClient client ) {
		System.out.println(client.toString());
		return loginService.logins(client);
	}

	@RequestMapping(value="/addregister", method=RequestMethod.POST)
	private Register addRegister(@RequestBody Register register ) {
		return registryservice.addRegister(register);
	}
	
	@RequestMapping(value="/downloadIn/{blno}", method = RequestMethod.GET)
	private ResponseEntity<Object> downloadFile(@PathVariable("blno") String blno) throws FileNotFoundException{
		String FILE_NAME = "src//main//resources//templates//test.xlsx";
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