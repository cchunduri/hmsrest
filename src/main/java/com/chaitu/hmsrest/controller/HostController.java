package com.chaitu.hmsrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.models.Host;
import com.chaitu.hmsrest.models.Hostel;

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
		Host host = new Host();
		host.setHostName("Chaitanya");
		host.setHostPassword("Ch");
		host.setHostEmail("ch@gmail.com");
		host.setHostPicPath("/pics/chaitanya.jpg");
		
		Hostel hostel = new Hostel();
		hostel.setHostelName("Chaitanya Ex Hostel");
		hostel.setHostelAddress("Mytrivanam");
		hostel.setLandMark("Mytrivanam");
		List<Hostel> hostelList = new ArrayList<>();
		hostelList.add(hostel);
		
		host.setHostelsList(hostelList);
		
		return hostDao.save(host).toString();
	}
}
