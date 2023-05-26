package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Area;
import com.example.demo.models.Personal;

import com.example.demo.services.PersonalServiceImpl;



@Controller
@RequestMapping("/home")
public class IndexController {
	
	@Autowired
	private PersonalServiceImpl personalService;
	
	
	
	@Value("${index.titulo.text}")
	private String title;
	
	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo",title);
		return "index";
	}
	
	@ModelAttribute("empleados")
	public List<Personal> obtenerEmpleados(){
		List<Personal> empleados = personalService.getAllPersonals();
		
		return empleados;
	}
	

	
	

}
