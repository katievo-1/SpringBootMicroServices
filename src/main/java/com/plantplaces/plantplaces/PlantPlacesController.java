package com.plantplaces.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start endpoint
 *test test 123
 *@return
 */
@Controller
public class PlantPlacesController {
	
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
		
	}
	
	@RequestMapping("/")
	public String index(){
		
		return "start";
		
	}

}
