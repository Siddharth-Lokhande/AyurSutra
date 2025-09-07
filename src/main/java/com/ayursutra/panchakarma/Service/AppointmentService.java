package com.ayursutra.panchakarma.Service;

import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayursutra.panchakarma.Model.Appointment;
import com.ayursutra.panchakarma.Repository.AppointmentRepo;
public class AppointmentService {
	@Service
	public class ProductService {
		@Autowired
		ProductRepo repo;
	
	
public List<Product> getProducts(){
		return repo.findAll();
}
public Product getProductById(int prodId) {
	return repo.findById(prodId).orElse(new Product());
}
public void addProduct(Product product) {
	repo.save(product);
}
public void updateProduct(Product prod) {
	repo.save(prod);
	}
public void deleteProduct(int prodId) {
	repo.deleteById(prodId);
	}
}
}
