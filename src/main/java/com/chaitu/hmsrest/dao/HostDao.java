package com.chaitu.hmsrest.dao;

import com.chaitu.hmsrest.models.Host;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface HostDao extends CrudRepository<Host, Integer> {
	List<Host> findAll();
}
