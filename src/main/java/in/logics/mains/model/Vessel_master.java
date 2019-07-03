package in.logics.mains.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Vessel_master {

	private long id;
	
	private String name;
	
	private String nikename;
	
	private List<Routess> routess;
	
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

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public List<Routess> getRoutess() {
		return routess;
	}

	public void setRoutess(List<Routess> routess) {
		this.routess = routess;
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

	public Vessel_master(long id, String name, String nikename, List<Routess> routess, long created_by, Date created_on,
			long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.nikename = nikename;
		this.routess = routess;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Vessel_master() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vessel_master [id=" + id + ", name=" + name + ", nikename=" + nikename + ", routess=" + routess
				+ ", created_by=" + created_by + ", created_on=" + created_on + ", updated_by=" + updated_by
				+ ", updated_on=" + updated_on + "]";
	}

}
