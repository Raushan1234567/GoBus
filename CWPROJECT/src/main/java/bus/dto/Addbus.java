package bus.dto;

import jakarta.persistence.*;

@Entity
public class Addbus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BusId;
	private String busname;
	private String BusNo;
	private String fromstart;
	private String Todest;
	private double fare;
	private int seataviable;
	public Addbus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addbus(String busname, String busNo, String fromstart, String todest, double fare, int seataviable) {
		super();
		this.busname = busname;
		BusNo = busNo;
		this.fromstart = fromstart;
		Todest = todest;
		this.fare = fare;
		this.seataviable = seataviable;
	}
	public int getBusId() {
		return BusId;
	}
	public void setBusId(int busId) {
		BusId = busId;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getBusNo() {
		return BusNo;
	}
	public void setBusNo(String busNo) {
		BusNo = busNo;
	}
	public String getFromstart() {
		return fromstart;
	}
	public void setFromstart(String fromstart) {
		this.fromstart = fromstart;
	}
	public String getTodest() {
		return Todest;
	}
	public void setTodest(String todest) {
		Todest = todest;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getSeataviable() {
		return seataviable;
	}
	public void setSeataviable(int seataviable) {
		this.seataviable = seataviable;
	}
	@Override
	public String toString() {
		return "Addbus [BusId=" + BusId + ", busname=" + busname + ", BusNo=" + BusNo + ", fromstart=" + fromstart
				+ ", Todest=" + Todest + ", fare=" + fare + ", seataviable=" + seataviable + "]";
	}
	
	
	
	
}
