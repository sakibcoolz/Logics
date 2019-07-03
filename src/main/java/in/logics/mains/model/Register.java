package in.logics.mains.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Registrys")
public class Register {
	
	@Id
	private long id;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String role;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	private long branch_id;
	
	private String status;
	
	private String address;
	
	private String contact_no;
	
	private String email_id;
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getBranch_id() {
		return branch_id;
	}

	public void setBranch_name(long branch_id) {
		this.branch_id = branch_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
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

	public Register(long id, String name, String username, String password, String role, Date dob, long branch_id,
			String status, String address, String contact_no, String email_id, long created_by, Date created_on,
			long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
		this.dob = dob;
		this.branch_id = branch_id;
		this.status = status;
		this.address = address;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", role="
				+ role + ", dob=" + dob + ", branch_id=" + branch_id + ", status=" + status + ", address=" + address
				+ ", contact_no=" + contact_no + ", email_id=" + email_id + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}
}
