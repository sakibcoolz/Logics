package in.logics.mains.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Vessel_master {

	private long id;
	
	private String name;
	
	private String voyageno;
	
	private String imono;
	
    private double summerdeadweight;
    
    private double grosston;
    
    private String vessel_discription;
    
    private double length;
    
    private String beam;
	
//	private String nikename;
	
//	private List<Routess> routess;
	
	private long created_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_on;
	
	private long updated_by;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_on;

	public Vessel_master(long id, String name, String voyageno, String imono, double summerdeadweight, double grosston,
			String vessel_discription, double length, String beam, long created_by, Date created_on, long updated_by,
			Date updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.voyageno = voyageno;
		this.imono = imono;
		this.summerdeadweight = summerdeadweight;
		this.grosston = grosston;
		this.vessel_discription = vessel_discription;
		this.length = length;
		this.beam = beam;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public Vessel_master() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getVoyageno() {
		return voyageno;
	}

	public void setVoyageno(String voyageno) {
		this.voyageno = voyageno;
	}

	public String getImono() {
		return imono;
	}

	public void setImono(String imono) {
		this.imono = imono;
	}

	public double getSummerdeadweight() {
		return summerdeadweight;
	}

	public void setSummerdeadweight(double summerdeadweight) {
		this.summerdeadweight = summerdeadweight;
	}

	public double getGrosston() {
		return grosston;
	}

	public void setGrosston(double grosston) {
		this.grosston = grosston;
	}

	public String getVessel_discription() {
		return vessel_discription;
	}

	public void setVessel_discription(String vessel_discription) {
		this.vessel_discription = vessel_discription;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getBeam() {
		return beam;
	}

	public void setBeam(String beam) {
		this.beam = beam;
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

	@Override
	public String toString() {
		return "Vessel_master [id=" + id + ", name=" + name + ", voyageno=" + voyageno + ", imono=" + imono
				+ ", summerdeadweight=" + summerdeadweight + ", grosston=" + grosston + ", vessel_discription="
				+ vessel_discription + ", length=" + length + ", beam=" + beam + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + "]";
	}

	
}
