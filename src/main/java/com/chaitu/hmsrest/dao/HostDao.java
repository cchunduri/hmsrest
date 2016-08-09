package com.chaitu.hmsrest.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.chaitu.hmsrest.models.Host;

@Transactional
public interface HostDao extends CrudRepository<Host, Integer> {
	public List<Host> findAll();
}
