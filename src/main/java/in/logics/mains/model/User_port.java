package in.logics.mains.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "ports")
public class User_port {
	
	@Id
	private long id;
	
	private String portname;
	
	private String locode;
	
	private long created_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_on;
	
	private long updated_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_on;

	public User_port(long id, String portname, String locode, long created_by, Date created_on, long updated_by,
			Date updated_on) {
		super();
		this.id = id;
		this.portname = portname;
		this.locode = locode;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public User_port() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPortname() {
		return portname;
	}

	public void setPortname(String portname) {
		this.portname = portname;
	}

	public String getLocode() {
		return locode;
	}

	public void setLocode(String locode) {
		this.locode = locode;
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

	@Override
	public String toString() {
		return "User_port [id=" + id + ", portname=" + portname + ", locode=" + locode + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}
	
	
	
}
