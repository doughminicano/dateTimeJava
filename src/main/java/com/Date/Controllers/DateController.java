package com.Date.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date() {
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String time () {
			return "time.jsp";
}
	
	
//	@RequestMapping("/{var}")
//
//    public String dateTime(@PathVariable("var") String var) {
//    	
//		String output= "";
//		
//		if(var.equals("date")) {
//			output= "Saturday, the 22 of January, 2028";
//		} else if (var.equals("time")) {
//			output = "11:30 PM";
//		} else {
//			output = "index.jsp";
//		}
//		return output;
//    }
	
}
