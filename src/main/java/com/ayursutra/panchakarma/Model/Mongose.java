package com.ayursutra.panchakarma.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mongose {
@Id
 Integer userid;
 String name;
 public Mongose(Integer userid, String name) {
	super();
	this.userid = userid;
	this.name = name;
 }
 @Override
 public String toString() {
	return "Mongose [userid=" + userid + ", name=" + name + "]";
 }
 

}
