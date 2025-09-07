package com.ayursutra.panchakarma.Model;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Appointment {
	@Id
	private	int AptId;
	
	private	String AptName;
	private	int price;
    public Appointment() {
    }

		@Override
		public String toString() {
			return "Product [AptidId=" + AptidId + ", AptidName=" + AptidName + ", price=" + price + "]";
		}	
}
