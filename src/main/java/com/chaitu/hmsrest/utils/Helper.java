package com.chaitu.hmsrest.utils;

import com.chaitu.hmsrest.models.Host;
import org.springframework.stereotype.Component;

/**
 * Created by chaitanya.
 */
@Component
public class Helper {

    public Host getTempHostDetails() {
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
