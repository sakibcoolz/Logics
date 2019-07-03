package in.logics.mains.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Port_names")
public class Port_names {
	
	@Id
	private String id;
	
	private String Country;
	
	private String CountryCode;
	
	private String PortCode;
	
	private String UNCode;
	
	private String PortName;
	
	private String PortNames;
	
	private String SubDivision;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getPortCode() {
		return PortCode;
	}

	public void setPortCode(String portCode) {
		PortCode = portCode;
	}

	public String getUNCode() {
		return UNCode;
	}

	public void setUNCode(String uNCode) {
		UNCode = uNCode;
	}

	public String getPortName() {
		return PortName;
	}

	public void setPortName(String portName) {
		PortName = portName;
	}

	public String getPortNames() {
		return PortNames;
	}

	public void setPortNames(String portNames) {
		PortNames = portNames;
	}

	public String getSubDivision() {
		return SubDivision;
	}

	public void setSubDivision(String subDivision) {
		SubDivision = subDivision;
	}

	public Port_names(String id, String country, String countryCode, String portCode, String uNCode, String portName,
			String portNames, String subDivision) {
		super();
		this.id = id;
		Country = country;
		CountryCode = countryCode;
		PortCode = portCode;
		UNCode = uNCode;
		PortName = portName;
		PortNames = portNames;
		SubDivision = subDivision;
	}

	public Port_names() {
		super();
		// TODO Auto-generated constructor stub
	}

}
