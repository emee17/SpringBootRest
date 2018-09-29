package com.idiot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdiotResource 
{
	@Autowired
	IdiotRepository idiotrepo;
	
	//@RequestMapping("idiots")//we can use either this or get mapping
	@GetMapping("idiots")
	public List<Idiot> getAll()
	{
		List<Idiot> Idiots = (List<Idiot>) idiotrepo.findAll();
		
		
		return Idiots;
	}
}
