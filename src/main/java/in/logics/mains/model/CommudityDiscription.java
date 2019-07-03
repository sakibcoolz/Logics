package in.logics.mains.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CommudityDiscription {
	
	private long id;
	private String category;
    private String product_discribtion;
    private long created_by;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date created_on;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProduct_discribtion() {
		return product_discribtion;
	}

	public void setProduct_discribtion(String product_discribtion) {
		this.product_discribtion = product_discribtion;
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

	public CommudityDiscription(long id, String category, String product_discribtion, long created_by,
			Date created_on) {
		super();
		this.id = id;
		this.category = category;
		this.product_discribtion = product_discribtion;
		this.created_by = created_by;
		this.created_on = created_on;
	}

	public CommudityDiscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CommudityDiscription [id=" + id + ", category=" + category + ", product_discribtion="
				+ product_discribtion + ", created_by=" + created_by + ", created_on=" + created_on + "]";
	}

}
