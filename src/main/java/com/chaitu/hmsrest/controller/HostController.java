package com.chaitu.hmsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitu.hmsrest.dao.HostDao;
import com.chaitu.hmsrest.models.Host;

@RestController
public class HostController {
	
	@Autowired 
	HostDao hostDao;
	
	@RequestMapping("/host/")
	public List<Host> findAllHost() {
		return hostDao.findAll();
	}
}
