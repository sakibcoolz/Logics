package in.logics.mains.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "commudity_master")
public class Commudity {
	
	@Id
	private long id;
	
	private String product_name;
	
	private List<CommudityDiscription> catAndDiscription;
	
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

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public List<CommudityDiscription> getCatAndDiscription() {
		return catAndDiscription;
	}

	public void setCatAndDiscription(List<CommudityDiscription> catAndDiscription) {
		this.catAndDiscription = catAndDiscription;
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

	public Commudity(long id, String product_name, List<CommudityDiscription> catAndDiscription, long created_by,
			Date created_on, long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.catAndDiscription = catAndDiscription;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Commudity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Commudity [id=" + id + ", product_name=" + product_name + ", catAndDiscription=" + catAndDiscription
				+ ", created_by=" + created_by + ", created_on=" + created_on + ", updated_by=" + updated_by
				+ ", updated_on=" + updated_on + "]";
	}

	
}
