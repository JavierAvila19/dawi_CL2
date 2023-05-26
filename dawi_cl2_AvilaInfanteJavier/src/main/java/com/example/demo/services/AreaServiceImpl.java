package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Area;

import com.example.demo.repositories.AreaDao;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaRepository;
	
	@Override
	public List<Area> getAllAreas() {
		// TODO Auto-generated method stub
		return this.areaRepository.findAll();
	}

}
