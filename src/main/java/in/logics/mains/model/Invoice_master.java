package in.logics.mains.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Invoice_master {
	
	@Id
	private long id;
	private String blno;
	private String forword_agent;
	private String notify_agent;
	private String particulars;
	private String receipt_no;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date receipt_date;
	private String customer_code;
	private long totalsffc;
	private long totaladlcc;
	private long totalCharges;
	private String cheque;
	private String remarks;
	private List<FrieghtCharges> affc;
	private List<FreightAdditional> adlc;
	private String status;
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
	public String getBlno() {
		return blno;
	}
	public void setBlno(String blno) {
		this.blno = blno;
	}
	public String getForword_agent() {
		return forword_agent;
	}
	public void setForword_agent(String forword_agent) {
		this.forword_agent = forword_agent;
	}
	public String getNotify_agent() {
		return notify_agent;
	}
	public void setNotify_agent(String notify_agent) {
		this.notify_agent = notify_agent;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}
	public Date getReceipt_date() {
		return receipt_date;
	}
	public void setReceipt_date(Date receipt_date) {
		this.receipt_date = receipt_date;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public long getTotalsffc() {
		return totalsffc;
	}
	public void setTotalsffc(long totalsffc) {
		this.totalsffc = totalsffc;
	}
	public long getTotaladlcc() {
		return totaladlcc;
	}
	public void setTotaladlcc(long totaladlcc) {
		this.totaladlcc = totaladlcc;
	}
	public long getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(long totalCharges) {
		this.totalCharges = totalCharges;
	}
	public String getCheque() {
		return cheque;
	}
	public void setCheque(String cheque) {
		this.cheque = cheque;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<FrieghtCharges> getAffc() {
		return affc;
	}
	public void setAffc(List<FrieghtCharges> affc) {
		this.affc = affc;
	}
	public List<FreightAdditional> getAdlc() {
		return adlc;
	}
	public void setAdlc(List<FreightAdditional> adlc) {
		this.adlc = adlc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Invoice_master(long id, String blno, String forword_agent, String notify_agent, String particulars,
			String receipt_no, Date receipt_date, String customer_code, long totalsffc, long totaladlcc,
			long totalCharges, String cheque, String remarks, List<FrieghtCharges> affc, List<FreightAdditional> adlc,
			String status, long created_by, Date created_on, long updated_by, Date updated_on) {
		super();
		this.id = id;
		this.blno = blno;
		this.forword_agent = forword_agent;
		this.notify_agent = notify_agent;
		this.particulars = particulars;
		this.receipt_no = receipt_no;
		this.receipt_date = receipt_date;
		this.customer_code = customer_code;
		this.totalsffc = totalsffc;
		this.totaladlcc = totaladlcc;
		this.totalCharges = totalCharges;
		this.cheque = cheque;
		this.remarks = remarks;
		this.affc = affc;
		this.adlc = adlc;
		this.status = status;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}
	public Invoice_master() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Invoice_master [id=" + id + ", blno=" + blno + ", forword_agent=" + forword_agent + ", notify_agent="
				+ notify_agent + ", particulars=" + particulars + ", receipt_no=" + receipt_no + ", receipt_date="
				+ receipt_date + ", customer_code=" + customer_code + ", totalsffc=" + totalsffc + ", totaladlcc="
				+ totaladlcc + ", totalCharges=" + totalCharges + ", cheque=" + cheque + ", remarks=" + remarks
				+ ", affc=" + affc + ", adlc=" + adlc + ", status=" + status + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}

}
