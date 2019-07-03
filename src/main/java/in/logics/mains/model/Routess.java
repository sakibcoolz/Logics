package in.logics.mains.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Routess {

	private long id;
	
	private String port_name;
	
	private String country_name;
	
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

	public String getPort_name() {
		return port_name;
	}

	public void setPort_name(String port_name) {
		this.port_name = port_name;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
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

	public Routess(long id, String port_name, String country_name, long created_by, Date created_on, long updated_by,
			Date updated_on) {
		super();
		this.id = id;
		this.port_name = port_name;
		this.country_name = country_name;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Routess() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Routess [id=" + id + ", port_name=" + port_name + ", country_name=" + country_name + ", created_by="
				+ created_by + ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on="
				+ updated_on + "]";
	}

	
}
