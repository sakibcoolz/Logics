package in.logics.mains.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FrieghtCharges {

	private long id;
	private String affcchargesitems;
	private long affunitPrice;
	private long affQty;
	private long affkgs;
	private long aff_amt_usd1;
	private long aff_amt_usd2;
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
	public String getAffcchargesitems() {
		return affcchargesitems;
	}
	public void setAffcchargesitems(String affcchargesitems) {
		this.affcchargesitems = affcchargesitems;
	}
	public long getAffunitPrice() {
		return affunitPrice;
	}
	public void setAffunitPrice(long affunitPrice) {
		this.affunitPrice = affunitPrice;
	}
	public long getAffQty() {
		return affQty;
	}
	public void setAffQty(long affQty) {
		this.affQty = affQty;
	}
	public long getAffkgs() {
		return affkgs;
	}
	public void setAffkgs(long affkgs) {
		this.affkgs = affkgs;
	}
	public long getAff_amt_usd1() {
		return aff_amt_usd1;
	}
	public void setAff_amt_usd1(long aff_amt_usd1) {
		this.aff_amt_usd1 = aff_amt_usd1;
	}
	public long getAff_amt_usd2() {
		return aff_amt_usd2;
	}
	public void setAff_amt_usd2(long aff_amt_usd2) {
		this.aff_amt_usd2 = aff_amt_usd2;
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
	public FrieghtCharges(long id, String affcchargesitems, long affunitPrice, long affQty, long affkgs,
			long aff_amt_usd1, long aff_amt_usd2, long created_by, Date created_on, long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.affcchargesitems = affcchargesitems;
		this.affunitPrice = affunitPrice;
		this.affQty = affQty;
		this.affkgs = affkgs;
		this.aff_amt_usd1 = aff_amt_usd1;
		this.aff_amt_usd2 = aff_amt_usd2;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}
	public FrieghtCharges() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FrieghtCharges [id=" + id + ", affcchargesitems=" + affcchargesitems + ", affunitPrice=" + affunitPrice
				+ ", affQty=" + affQty + ", affkgs=" + affkgs + ", aff_amt_usd1=" + aff_amt_usd1 + ", aff_amt_usd2="
				+ aff_amt_usd2 + ", created_by=" + created_by + ", created_on=" + created_on + ", updated_by="
				+ updated_by + ", updated_on=" + updated_on + "]";
	}
	
	
	
	
}
