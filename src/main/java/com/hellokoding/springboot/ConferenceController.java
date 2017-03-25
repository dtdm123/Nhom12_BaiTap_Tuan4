package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConferenceController {

	@RequestMapping(value="/conference", method=RequestMethod.GET)
	String showPage2(){
		return "jsp/conference";
	}
	
}
