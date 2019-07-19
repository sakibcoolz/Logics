package in.logics.mains.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Country_name {
	
	private long id;
	
	private String countryname;
	
	private long  created_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date  created_on;
	
	private long  updated_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private String updated_on;

	public Country_name(long id, String countryname, long created_by, Date created_on, long updated_by,
			String updated_on) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Country_name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
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

	public String getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}

	@Override
	public String toString() {
		return "Country_name [id=" + id + ", countryname=" + countryname + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}
	
	

}
