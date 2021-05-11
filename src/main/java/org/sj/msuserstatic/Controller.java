package org.sj.msuserstatic;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@CrossOrigin(origins = "*")
@Log
@RequestMapping("/ms-user-static")
public class Controller {

	
	@GetMapping("/getUser")
	public String getUser() {
		//log.log(Level.INFO, "Get user {0}",id);
		return "abcd";
	}


}
