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
import com.ayursutra.panchakarma.Model.Appointment;
import com.ayursutra.panchakarma.Service.AppointmentService;

@RestController
@CrossOrigin
public class AppointmentController {
	@Autowired
	AppointmentService service;
@GetMapping("/products")
public List<Appointment> getProduct() {
	return service.getProducts();
}
@GetMapping("/products/{id}")
public Appointment getProductById(@PathVariable int id) {
	return service.getProductById(id);
}
@PostMapping("/products")
public void addProduct(@RequestBody Appointment product) {
	service.addProduct(product);
}
@PutMapping("/products")
public void updateProduct(@RequestBody Appointment product) {
	service.updateProduct(product);
}
@DeleteMapping("/products/{id}")
public void deleteProduct(@PathVariable int id) {
	service.deleteProduct(id);
}
}