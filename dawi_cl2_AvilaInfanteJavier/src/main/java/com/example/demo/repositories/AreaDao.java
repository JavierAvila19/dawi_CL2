package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Area;


@Repository
public interface AreaDao extends CrudRepository<Area, Long>{

	public List<Area> findAll();
}
