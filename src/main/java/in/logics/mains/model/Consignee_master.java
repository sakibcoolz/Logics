package in.logics.mains.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "consignee_master")
public class Consignee_master {
	
	@Id
	private long id;
	
	private String name;
	
	private String city;
	
	private String country;
	
	private long contact_no;
	
	private String email_id;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private long created_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_on;
	
	private long updated_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_on;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public Consignee_master() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consignee_master(long id, String name, String city, String country, long contact_no, String email_id,
			String address1, String address2, String address3, long created_by, Date created_on, long updated_by,
			Date updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	@Override
	public String toString() {
		return "Consignee_master [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country
				+ ", contact_no=" + contact_no + ", email_id=" + email_id + ", address1=" + address1 + ", address2="
				+ address2 + ", address3=" + address3 + ", created_by=" + created_by + ", created_on=" + created_on
				+ ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}

}
