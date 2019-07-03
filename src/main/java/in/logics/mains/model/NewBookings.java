package in.logics.mains.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NewBookings {
	
	private long id;
	
	private String billNo;
	
	private String shipper;
	
	private String consignee;
	
	private String exportRef;
	
	private String forwordAgent;
	
	private String notifyParty;
	
	private String countryOrigin;
	
	private String notifyAndShippingAgent;
	
	private String vesselName;	
	
	private String voyagenos;
	
	private String preCarrigeby;
	
	private String placeReceipt;
	
	private String inlandRouting;
	
	private String placeDelivery;

	private String finalDestination;

	private String transhipment;

	private String commuditydetails;

	private String marksAndNumber;

	private String sealNo;

	private String containerNos;
	
	private String trackingContainerNo;
	
	private String  containerISO;
	
	private String pol_code;
	
	private String pol_name;
	
	private String  pod_code;
	
	private String pod_name;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date departureDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date arriveDate;
	
	private String measurement;
	
	private long totalCharges;
	
	private long maxGrossWeight;
	
	private long containerGrossWeight;
	
	private long  noBl;
	
	private String obd;
	
	private long conPackages;
	
	private String  loadGrossWeight;
	
	private String  forTheCarrier;
	
	private long excRate;
	
	private long  units;
	
	private String  prepaid;
	
	private String  noContainerPkgs;

	private String  freightCharges;

	private String  collect;
	
	private long  declaredValue;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private String  datedAt;
	
	private String  containerDiscription;
	
	private String  remarks;
	
	private String  deliveryAgent;
	
	private String  ctnrDate;
	
	private String voyageno1;
	
	private String statusDetails;
	
	private String  vesselName1;
	
	private String ctnrDepotNo;
	
	private String bookNo;
	
	private long  created_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date  created_on;
	
	private long  updated_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private String updated_on;

	public NewBookings(long id, String billNo, String shipper, String consignee, String exportRef, String forwordAgent,
			String notifyParty, String countryOrigin, String notifyAndShippingAgent, String vesselName,
			String voyagenos, String preCarrigeby, String placeReceipt, String inlandRouting, String placeDelivery,
			String finalDestination, String transhipment, String commuditydetails, String marksAndNumber, String sealNo,
			String containerNos, String trackingContainerNo, String containerISO, String pol_code, String pol_name,
			String pod_code, String pod_name, Date departureDate, Date arriveDate, String measurement,
			long totalCharges, long maxGrossWeight, long containerGrossWeight, long noBl, String obd, long conPackages,
			String loadGrossWeight, String forTheCarrier, long excRate, long units, String prepaid,
			String noContainerPkgs, String freightCharges, String collect, long declaredValue, String datedAt,
			String containerDiscription, String remarks, String deliveryAgent, String ctnrDate, String voyageno1,
			String statusDetails, String vesselName1, String ctnrDepotNo, String bookNo, long created_by,
			Date created_on, long updated_by, String updated_on) {
		super();
		this.id = id;
		this.billNo = billNo;
		this.shipper = shipper;
		this.consignee = consignee;
		this.exportRef = exportRef;
		this.forwordAgent = forwordAgent;
		this.notifyParty = notifyParty;
		this.countryOrigin = countryOrigin;
		this.notifyAndShippingAgent = notifyAndShippingAgent;
		this.vesselName = vesselName;
		this.voyagenos = voyagenos;
		this.preCarrigeby = preCarrigeby;
		this.placeReceipt = placeReceipt;
		this.inlandRouting = inlandRouting;
		this.placeDelivery = placeDelivery;
		this.finalDestination = finalDestination;
		this.transhipment = transhipment;
		this.commuditydetails = commuditydetails;
		this.marksAndNumber = marksAndNumber;
		this.sealNo = sealNo;
		this.containerNos = containerNos;
		this.trackingContainerNo = trackingContainerNo;
		this.containerISO = containerISO;
		this.pol_code = pol_code;
		this.pol_name = pol_name;
		this.pod_code = pod_code;
		this.pod_name = pod_name;
		this.departureDate = departureDate;
		this.arriveDate = arriveDate;
		this.measurement = measurement;
		this.totalCharges = totalCharges;
		this.maxGrossWeight = maxGrossWeight;
		this.containerGrossWeight = containerGrossWeight;
		this.noBl = noBl;
		this.obd = obd;
		this.conPackages = conPackages;
		this.loadGrossWeight = loadGrossWeight;
		this.forTheCarrier = forTheCarrier;
		this.excRate = excRate;
		this.units = units;
		this.prepaid = prepaid;
		this.noContainerPkgs = noContainerPkgs;
		this.freightCharges = freightCharges;
		this.collect = collect;
		this.declaredValue = declaredValue;
		this.datedAt = datedAt;
		this.containerDiscription = containerDiscription;
		this.remarks = remarks;
		this.deliveryAgent = deliveryAgent;
		this.ctnrDate = ctnrDate;
		this.voyageno1 = voyageno1;
		this.statusDetails = statusDetails;
		this.vesselName1 = vesselName1;
		this.ctnrDepotNo = ctnrDepotNo;
		this.bookNo = bookNo;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public NewBookings() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NewBookings [id=" + id + ", billNo=" + billNo + ", shipper=" + shipper + ", consignee=" + consignee
				+ ", exportRef=" + exportRef + ", forwordAgent=" + forwordAgent + ", notifyParty=" + notifyParty
				+ ", countryOrigin=" + countryOrigin + ", notifyAndShippingAgent=" + notifyAndShippingAgent
				+ ", vesselName=" + vesselName + ", voyagenos=" + voyagenos + ", preCarrigeby=" + preCarrigeby
				+ ", placeReceipt=" + placeReceipt + ", inlandRouting=" + inlandRouting + ", placeDelivery="
				+ placeDelivery + ", finalDestination=" + finalDestination + ", transhipment=" + transhipment
				+ ", commuditydetails=" + commuditydetails + ", marksAndNumber=" + marksAndNumber + ", sealNo=" + sealNo
				+ ", containerNos=" + containerNos + ", trackingContainerNo=" + trackingContainerNo + ", containerISO="
				+ containerISO + ", pol_code=" + pol_code + ", pol_name=" + pol_name + ", pod_code=" + pod_code
				+ ", pod_name=" + pod_name + ", departureDate=" + departureDate + ", arriveDate=" + arriveDate
				+ ", measurement=" + measurement + ", totalCharges=" + totalCharges + ", maxGrossWeight="
				+ maxGrossWeight + ", containerGrossWeight=" + containerGrossWeight + ", noBl=" + noBl + ", obd=" + obd
				+ ", conPackages=" + conPackages + ", loadGrossWeight=" + loadGrossWeight + ", forTheCarrier="
				+ forTheCarrier + ", excRate=" + excRate + ", units=" + units + ", prepaid=" + prepaid
				+ ", noContainerPkgs=" + noContainerPkgs + ", freightCharges=" + freightCharges + ", collect=" + collect
				+ ", declaredValue=" + declaredValue + ", datedAt=" + datedAt + ", containerDiscription="
				+ containerDiscription + ", remarks=" + remarks + ", deliveryAgent=" + deliveryAgent + ", ctnrDate="
				+ ctnrDate + ", voyageno1=" + voyageno1 + ", statusDetails=" + statusDetails + ", vesselName1="
				+ vesselName1 + ", ctnrDepotNo=" + ctnrDepotNo + ", bookNo=" + bookNo + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getExportRef() {
		return exportRef;
	}

	public void setExportRef(String exportRef) {
		this.exportRef = exportRef;
	}

	public String getForwordAgent() {
		return forwordAgent;
	}

	public void setForwordAgent(String forwordAgent) {
		this.forwordAgent = forwordAgent;
	}

	public String getNotifyParty() {
		return notifyParty;
	}

	public void setNotifyParty(String notifyParty) {
		this.notifyParty = notifyParty;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getNotifyAndShippingAgent() {
		return notifyAndShippingAgent;
	}

	public void setNotifyAndShippingAgent(String notifyAndShippingAgent) {
		this.notifyAndShippingAgent = notifyAndShippingAgent;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getVoyagenos() {
		return voyagenos;
	}

	public void setVoyagenos(String voyagenos) {
		this.voyagenos = voyagenos;
	}

	public String getPreCarrigeby() {
		return preCarrigeby;
	}

	public void setPreCarrigeby(String preCarrigeby) {
		this.preCarrigeby = preCarrigeby;
	}

	public String getPlaceReceipt() {
		return placeReceipt;
	}

	public void setPlaceReceipt(String placeReceipt) {
		this.placeReceipt = placeReceipt;
	}

	public String getInlandRouting() {
		return inlandRouting;
	}

	public void setInlandRouting(String inlandRouting) {
		this.inlandRouting = inlandRouting;
	}

	public String getPlaceDelivery() {
		return placeDelivery;
	}

	public void setPlaceDelivery(String placeDelivery) {
		this.placeDelivery = placeDelivery;
	}

	public String getFinalDestination() {
		return finalDestination;
	}

	public void setFinalDestination(String finalDestination) {
		this.finalDestination = finalDestination;
	}

	public String getTranshipment() {
		return transhipment;
	}

	public void setTranshipment(String transhipment) {
		this.transhipment = transhipment;
	}

	public String getCommuditydetails() {
		return commuditydetails;
	}

	public void setCommuditydetails(String commuditydetails) {
		this.commuditydetails = commuditydetails;
	}

	public String getMarksAndNumber() {
		return marksAndNumber;
	}

	public void setMarksAndNumber(String marksAndNumber) {
		this.marksAndNumber = marksAndNumber;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getContainerNos() {
		return containerNos;
	}

	public void setContainerNos(String containerNos) {
		this.containerNos = containerNos;
	}

	public String getTrackingContainerNo() {
		return trackingContainerNo;
	}

	public void setTrackingContainerNo(String trackingContainerNo) {
		this.trackingContainerNo = trackingContainerNo;
	}

	public String getContainerISO() {
		return containerISO;
	}

	public void setContainerISO(String containerISO) {
		this.containerISO = containerISO;
	}

	public String getPol_code() {
		return pol_code;
	}

	public void setPol_code(String pol_code) {
		this.pol_code = pol_code;
	}

	public String getPol_name() {
		return pol_name;
	}

	public void setPol_name(String pol_name) {
		this.pol_name = pol_name;
	}

	public String getPod_code() {
		return pod_code;
	}

	public void setPod_code(String pod_code) {
		this.pod_code = pod_code;
	}

	public String getPod_name() {
		return pod_name;
	}

	public void setPod_name(String pod_name) {
		this.pod_name = pod_name;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public long getTotalCharges() {
		return totalCharges;
	}

	public void setTotalCharges(long totalCharges) {
		this.totalCharges = totalCharges;
	}

	public long getMaxGrossWeight() {
		return maxGrossWeight;
	}

	public void setMaxGrossWeight(long maxGrossWeight) {
		this.maxGrossWeight = maxGrossWeight;
	}

	public long getContainerGrossWeight() {
		return containerGrossWeight;
	}

	public void setContainerGrossWeight(long containerGrossWeight) {
		this.containerGrossWeight = containerGrossWeight;
	}

	public long getNoBl() {
		return noBl;
	}

	public void setNoBl(long noBl) {
		this.noBl = noBl;
	}

	public String getObd() {
		return obd;
	}

	public void setObd(String obd) {
		this.obd = obd;
	}

	public long getConPackages() {
		return conPackages;
	}

	public void setConPackages(long conPackages) {
		this.conPackages = conPackages;
	}

	public String getLoadGrossWeight() {
		return loadGrossWeight;
	}

	public void setLoadGrossWeight(String loadGrossWeight) {
		this.loadGrossWeight = loadGrossWeight;
	}

	public String getForTheCarrier() {
		return forTheCarrier;
	}

	public void setForTheCarrier(String forTheCarrier) {
		this.forTheCarrier = forTheCarrier;
	}

	public long getExcRate() {
		return excRate;
	}

	public void setExcRate(long excRate) {
		this.excRate = excRate;
	}

	public long getUnits() {
		return units;
	}

	public void setUnits(long units) {
		this.units = units;
	}

	public String getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(String prepaid) {
		this.prepaid = prepaid;
	}

	public String getNoContainerPkgs() {
		return noContainerPkgs;
	}

	public void setNoContainerPkgs(String noContainerPkgs) {
		this.noContainerPkgs = noContainerPkgs;
	}

	public String getFreightCharges() {
		return freightCharges;
	}

	public void setFreightCharges(String freightCharges) {
		this.freightCharges = freightCharges;
	}

	public String getCollect() {
		return collect;
	}

	public void setCollect(String collect) {
		this.collect = collect;
	}

	public long getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(long declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getDatedAt() {
		return datedAt;
	}

	public void setDatedAt(String datedAt) {
		this.datedAt = datedAt;
	}

	public String getContainerDiscription() {
		return containerDiscription;
	}

	public void setContainerDiscription(String containerDiscription) {
		this.containerDiscription = containerDiscription;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDeliveryAgent() {
		return deliveryAgent;
	}

	public void setDeliveryAgent(String deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}

	public String getCtnrDate() {
		return ctnrDate;
	}

	public void setCtnrDate(String ctnrDate) {
		this.ctnrDate = ctnrDate;
	}

	public String getVoyageno1() {
		return voyageno1;
	}

	public void setVoyageno1(String voyageno1) {
		this.voyageno1 = voyageno1;
	}

	public String getStatusDetails() {
		return statusDetails;
	}

	public void setStatusDetails(String statusDetails) {
		this.statusDetails = statusDetails;
	}

	public String getVesselName1() {
		return vesselName1;
	}

	public void setVesselName1(String vesselName1) {
		this.vesselName1 = vesselName1;
	}

	public String getCtnrDepotNo() {
		return ctnrDepotNo;
	}

	public void setCtnrDepotNo(String ctnrDepotNo) {
		this.ctnrDepotNo = ctnrDepotNo;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
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

}
