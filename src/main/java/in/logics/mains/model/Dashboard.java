package in.logics.mains.model;

public class Dashboard {
	private long totalShipper;
	private long totalBills;
	private long totalConsignee;
	private long totalInvoice;
	public long getTotalShipper() {
		return totalShipper;
	}
	public void setTotalShipper(long totalShipper) {
		this.totalShipper = totalShipper;
	}
	public long getTotalBills() {
		return totalBills;
	}
	public void setTotalBills(long totalBills) {
		this.totalBills = totalBills;
	}
	public long getTotalConsignee() {
		return totalConsignee;
	}
	public void setTotalConsignee(long totalConsignee) {
		this.totalConsignee = totalConsignee;
	}
	public long getTotalInvoice() {
		return totalInvoice;
	}
	public void setTotalInvoice(long totalInvoice) {
		this.totalInvoice = totalInvoice;
	}
	public Dashboard(long totalShipper, long totalBills, long totalConsignee, long totalInvoice) {
		super();
		this.totalShipper = totalShipper;
		this.totalBills = totalBills;
		this.totalConsignee = totalConsignee;
		this.totalInvoice = totalInvoice;
	}
	public Dashboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dashboard [totalShipper=" + totalShipper + ", totalBills=" + totalBills + ", totalConsignee="
				+ totalConsignee + ", totalInvoice=" + totalInvoice + "]";
	}

}
