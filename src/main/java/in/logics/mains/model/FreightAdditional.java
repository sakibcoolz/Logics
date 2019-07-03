package in.logics.mains.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FreightAdditional {
	@Id
	private long id;
	private String adlCharges;
	private long adlUnit;
	private long adlqty;
	private long adlkgs;
	private long adlAmt1;
	private long adlAmt2;
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
	public String getAdlCharges() {
		return adlCharges;
	}
	public void setAdlCharges(String adlCharges) {
		this.adlCharges = adlCharges;
	}
	public long getAdlUnit() {
		return adlUnit;
	}
	public void setAdlUnit(long adlUnit) {
		this.adlUnit = adlUnit;
	}
	public long getAdlqty() {
		return adlqty;
	}
	public void setAdlqty(long adlqty) {
		this.adlqty = adlqty;
	}
	public long getAdlkgs() {
		return adlkgs;
	}
	public void setAdlkgs(long adlkgs) {
		this.adlkgs = adlkgs;
	}
	public long getAdlAmt1() {
		return adlAmt1;
	}
	public void setAdlAmt1(long adlAmt1) {
		this.adlAmt1 = adlAmt1;
	}
	public long getAdlAmt2() {
		return adlAmt2;
	}
	public void setAdlAmt2(long adlAmt2) {
		this.adlAmt2 = adlAmt2;
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
	public FreightAdditional(long id, String adlCharges, long adlUnit, long adlqty, long adlkgs, long adlAmt1,
			long adlAmt2, long created_by, Date created_on, long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.adlCharges = adlCharges;
		this.adlUnit = adlUnit;
		this.adlqty = adlqty;
		this.adlkgs = adlkgs;
		this.adlAmt1 = adlAmt1;
		this.adlAmt2 = adlAmt2;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}
	public FreightAdditional() {
		super();
		// TODO Auto-generated constructor stub
	}
}
