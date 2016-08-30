package com.chaitu.hmsrest.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.chaitu.hmsrest.models.Hostel;

@Transactional
public interface HostelDao extends CrudRepository<Hostel, Long>{
	public List<Hostel> findAll();
	public Long deleteByHostelId(long hostelId);
}
