package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Personal;

@Repository
public interface PersonalDao extends CrudRepository<Personal, Long>{
	
	public List<Personal> findAll();
	

}
