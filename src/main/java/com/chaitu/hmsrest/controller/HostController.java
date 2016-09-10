package com.chaitu.hmsrest.controller;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.dao.HostelDao;
import com.chaitu.hmsrest.models.Host;
import com.chaitu.hmsrest.models.Hostel;
import com.chaitu.hmsrest.utils.AddressProof;
import com.chaitu.hmsrest.utils.Helper;
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

    @Autowired
    Helper helper;

    @RequestMapping(value = "/host/", method = RequestMethod.GET)
	public List<Host> findAllHost() {
		return hostDao.findAll();
	}
	
	@RequestMapping(value = "/host/create", method = RequestMethod.POST) 
	public ResponseEntity<String> createHost() {
        return new ResponseEntity<>(hostDao.save(helper.getTempHostDetails()).toString(), HttpStatus.OK);
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
}
