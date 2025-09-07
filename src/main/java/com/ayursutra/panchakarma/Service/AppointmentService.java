package com.ayursutra.panchakarma.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayursutra.panchakarma.Model.Appointment;
import com.ayursutra.panchakarma.Repository.AppointmentRepo;
@Service
public class AppointmentService {
		@Autowired
		AppointmentRepo repo;
	
public List<Appointment> getProducts(){
		return repo.findAll();
}
public Appointment getProductById(int prodId) {
	return repo.findById(prodId).orElse(new Appointment());
}
public void addProduct(Appointment appointment) {
	repo.save(appointment);
}
public void updateProduct(Appointment appointment) {
	repo.save(appointment);
	}
public void deleteProduct(int aptid) {
	repo.deleteById(aptid);
	}
}
