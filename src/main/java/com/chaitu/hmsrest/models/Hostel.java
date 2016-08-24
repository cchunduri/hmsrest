package com.chaitu.hmsrest.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOSTEL")
public class Hostel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hostelId;
	
	@Column 
	private String hostelName;
	
	@Column
	private String landMark;
	
	@Column
	private String hostelAddress;
	
	@Column
	private int numberOfRooms;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Rooms> typeOfRooms;
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public List<Rooms> getTypeOfRooms() {
		return typeOfRooms;
	}

	public void setTypeOfRooms(List<Rooms> typeOfRooms) {
		this.typeOfRooms = typeOfRooms;
	}

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", hostelName=" + hostelName + ", landMark=" + landMark
				+ ", hostelAddress=" + hostelAddress + ", numberOfRooms=" + numberOfRooms + ", typeOfRooms="
				+ typeOfRooms + "]";
	}
	
}
