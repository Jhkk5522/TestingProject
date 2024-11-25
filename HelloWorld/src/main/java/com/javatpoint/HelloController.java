package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	  @RequestMapping("/hello1") 
	  public String display()
	  { 
		  return "page1"; 
	  }
	 
}
