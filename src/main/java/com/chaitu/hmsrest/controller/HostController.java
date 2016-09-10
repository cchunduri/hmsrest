package com.chaitu.hmsrest.controller;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.dao.HostelDao;
import com.chaitu.hmsrest.models.Host;
import com.chaitu.hmsrest.models.Hostel;
import com.chaitu.hmsrest.utils.AddressProof;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
class HostController {

    private static Logger logger = LoggerFactory.getLogger(HostController.class);

    @Autowired
    private HostDao hostDao;

    @Autowired
    private HostelDao hostelDao;

    @RequestMapping(value = "/host/", method = RequestMethod.GET)
	public List<Host> findAllHost() {
		return hostDao.findAll();
	}
	
	@RequestMapping(value = "/host/create", method = RequestMethod.POST) 
	public ResponseEntity<String> createHost() {
        return new ResponseEntity<>(hostDao.save(getTempHostDetails()).toString(), HttpStatus.OK);
    }
	
	@RequestMapping(value = "/host/{hostId}/addhostel")
    public ResponseEntity<Hostel> addHostel(@PathVariable long hostId) {
        logger.info("HostId: " + hostId);
        return new ResponseEntity<>(hostelDao.save(addHostelToHost(hostId)),
                HttpStatus.OK);
	}

    @RequestMapping(value = "/host/hostel/delete/{hostelId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteHostel(@NotNull @PathVariable long hostelId) {
        if (hostelDao.exists(hostelId)) {
            hostelDao.delete(hostelId);
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Please give us valid hostel id", HttpStatus.NOT_FOUND);
        }
    }

    private Hostel addHostelToHost(long hostId) {

		Hostel hostel = new Hostel();
		hostel.setHostelName("Chaitanya Ex Hostel");
		hostel.setAddressLine1("SrinivasaNagar West");
		hostel.setAddressLine2("");
		hostel.setCity("Hyderabad");
		hostel.setLandMark("Mytrivanam");
		hostel.setState("Telangana");
		hostel.setPinCode("523168");
		hostel.setNumberOfRooms(30);
        hostel.setHostId(hostId);

        return hostel;
    }

    private Host getTempHostDetails() {
        Host host = new Host();
        host.setHostName("Chaitanya");
        host.setHostPassword("Ch");
        host.setHostEmail("ch@gmail.com");
        host.setHostPicPath("/pics/chaitanya.jpg");
        host.setAddressProof(AddressProof.PAN_CARD);
        host.setAddressProofId("BAXPC5019N");

//		Rooms acRooms = new Rooms();
//		acRooms.setNumberRoomsOfThisType(10);
//		acRooms.setRoomType(RoomTypes.AC_TWO_SHARING);
//
//		Rooms fiveSharing = new Rooms();
//		fiveSharing.setNumberRoomsOfThisType(10);
//		fiveSharing.setRoomType(RoomTypes.FIVE_SHARING);
//
//		Rooms threeSharing = new Rooms();
//		threeSharing.setNumberRoomsOfThisType(5);
//		threeSharing.setRoomType(RoomTypes.THREE_SHARING);
//
//		Rooms singleRooms = new Rooms();
//		singleRooms.setNumberRoomsOfThisType(10);
//		singleRooms.setRoomType(RoomTypes.SINGLE_ROOMS);
//
//		List<Rooms> roomsList = new ArrayList<>();
//		roomsList.add(acRooms);
//		roomsList.add(fiveSharing);
//		roomsList.add(threeSharing);
//		roomsList.add(singleRooms);
//		hostel.setTypeOfRooms(roomsList);

        return host;
    }
}
