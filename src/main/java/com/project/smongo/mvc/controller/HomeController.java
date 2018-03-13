package com.project.smongo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.smongo.mvc.entity.HomeEntity;
import com.project.smongo.mvc.repository.HomeRepository;
import com.project.smongo.mvc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeRepository repos;
	
	@Autowired
	private HomeService homeService;

	@RequestMapping("/")
	@ResponseBody
	public List<HomeEntity> showHome() {
		
		 this.repos.save(homeService.create());
		return this.repos.findAll();
	}
	
	
}
