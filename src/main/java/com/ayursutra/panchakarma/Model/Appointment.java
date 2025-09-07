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
	public Appointment(int aptId, String aptName, int price) {
		super();
		AptId = aptId;
		AptName = aptName;
		this.price = price;
	}
	public int getAptId() {
		return AptId;
	}

	public void setAptId(int aptId) {
		AptId = aptId;
	}

	public String getAptName() {
		return AptName;
	}

	public void setAptName(String aptName) {
		AptName = aptName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


		@Override
		public String toString() {
			return "Product [AptidId=" + AptId + ", AptidName=" + AptName + ", price=" + price + "]";
		}	
}
