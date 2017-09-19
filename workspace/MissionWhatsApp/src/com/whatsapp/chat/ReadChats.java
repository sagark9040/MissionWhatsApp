package com.whatsapp.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReadChats {
	
	@ResponseBody
	@RequestMapping(value = "/readGroups", method = RequestMethod.GET)
	public String readGroups(){
		return "Reading groups";
	}
	
	
	
	
}
