package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
    
    @GetMapping("/foodSearch")
	public String foodSearch(){
		return "food/master_food/food_search";
	}
}
