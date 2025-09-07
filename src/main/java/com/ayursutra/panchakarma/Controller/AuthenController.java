package com.ayursutra.panchakarma.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ayursutra.panchakarma.Model.Authen;
import com.ayursutra.panchakarma.Service.AuthenService;
@RestController
@CrossOrigin
public class AuthenController {
	@Autowired
	AuthenService service;
@PostMapping("/updateuser")
public void updatepassword(@RequestBody Authen authen) {
	 service.updatepassword(authen);
}
@PostMapping("/signup")
public String newuser(@RequestBody Authen authen) {
	return service.registerUser(authen);
}
@PostMapping("/login")
public Boolean login(@RequestBody Authen authen) {
	return service.login(authen);
}
@DeleteMapping("/deleteuser/{id}")
public void deleteuser(@PathVariable int id) {
	 service.deleteuser(id);
}
}
