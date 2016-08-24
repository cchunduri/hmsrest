package com.chaitu.hmsrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.models.Host;
import com.chaitu.hmsrest.models.Hostel;
import com.chaitu.hmsrest.models.Rooms;
import com.chaitu.hmsrest.utils.RoomTypes;

@RestController
public class HostController {
	
	@Autowired 
	HostDao hostDao;
	
	@RequestMapping("/host/")
	public List<Host> findAllHost() {
		return hostDao.findAll();
	}
	
	@RequestMapping("/host/create") 
	public String createHost() {
		Host host = getTempHostDetails();
		
		return hostDao.save(host).toString();
	}

	private Host getTempHostDetails() {
		Host host = new Host();
		host.setHostName("Chaitanya");
		host.setHostPassword("Ch");
		host.setHostEmail("ch@gmail.com");
		host.setHostPicPath("/pics/chaitanya.jpg");
		
		Hostel hostel = new Hostel();
		hostel.setHostelName("Chaitanya Ex Hostel");
		hostel.setHostelAddress("Mytrivanam");
		hostel.setLandMark("Mytrivanam");
		hostel.setNumberOfRooms(30);
		
		Rooms acRooms = new Rooms();
		acRooms.setNumberRoomsOfThisType(10);
		acRooms.setRoomType(RoomTypes.AC_TWO_SHARING);
		
		Rooms fiveSharing = new Rooms();
		fiveSharing.setNumberRoomsOfThisType(10);
		fiveSharing.setRoomType(RoomTypes.FIVE_SHARING);
		
		Rooms threeSharing = new Rooms();
		threeSharing.setNumberRoomsOfThisType(5);
		threeSharing.setRoomType(RoomTypes.THREE_SHARING);
		
		Rooms singleRooms = new Rooms();
		singleRooms.setNumberRoomsOfThisType(10);
		singleRooms.setRoomType(RoomTypes.SINGLE_ROOMS);
		
		List<Rooms> roomsList = new ArrayList<>();
		roomsList.add(acRooms);
		roomsList.add(fiveSharing);
		roomsList.add(threeSharing);
		roomsList.add(singleRooms);
		
		hostel.setTypeOfRooms(roomsList);
		List<Hostel> hostelList = new ArrayList<>();
		hostelList.add(hostel);
		
		host.setHostelsList(hostelList);
		return host;
	}
	
}
