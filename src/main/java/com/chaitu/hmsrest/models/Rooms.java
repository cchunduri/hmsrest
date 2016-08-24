package com.chaitu.hmsrest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.chaitu.hmsrest.utils.RoomTypes;

@Entity
@Table(name = "ROOMS")
public class Rooms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;
	
	@Column
	private int numberRoomsOfThisType;
	
	@Column
	private RoomTypes roomType;

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public int getNumberRoomsOfThisType() {
		return numberRoomsOfThisType;
	}

	public void setNumberRoomsOfThisType(int i) {
		this.numberRoomsOfThisType = i;
	}

	public RoomTypes getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomTypes roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", numberRoomsOfThisType=" + numberRoomsOfThisType + ", roomType=" + roomType
				+ "]";
	}
}
