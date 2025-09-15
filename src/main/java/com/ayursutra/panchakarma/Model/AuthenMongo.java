package com.ayursutra.panchakarma.Model;

import jakarta.persistence.Id;

public class AuthenMongo {
@Id
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public AuthenMongo(int id) {
	super();
	this.id = id;
}

@Override
public String toString() {
	return "AuthenMongo [id=" + id + "]";
}

}
