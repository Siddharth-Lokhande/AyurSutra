package com.ayursutra.panchakarma.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ayursutra.panchakarma.Repository.MongoRepo;
import com.ayursutra.panchakarma.Model.Mongose;
@RestController

public class Mongocontroller {
	@Autowired
	MongoRepo mong;
	
	@PostMapping("/adduser")
	public void adduser(@RequestBody Mongose mon) {
		System.out.println("Received: " + mon);
		 mong.save(mon);
		 System.out.println("after Received: " + mon);
	}
}
