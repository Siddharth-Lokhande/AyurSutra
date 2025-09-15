package com.ayursutra.panchakarma.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
@Component
public class PatientProfile {
@Id
 private Integer userid;
 private String name;
 private String address;
 private Integer phone;
 private boolean ismale;
 private byte age;
 private char bloodgroup;
 private Integer height;
 private Integer weight;
 private Integer pincode;
 private String profilePhoto;
 public Integer getUserid() {
	return userid;
 }
 public void setUserid(Integer userid) {
	this.userid = userid;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getAddress() {
	return address;
 }
 public void setAddress(String address) {
	this.address = address;
 }
 public Integer getPhone() {
	return phone;
 }
 public void setPhone(Integer phone) {
	this.phone = phone;
 }
 public boolean isIsmale() {
	return ismale;
 }
 public void setIsmale(boolean ismale) {
	this.ismale = ismale;
 }
 public byte getAge() {
	return age;
 }
 public void setAge(byte age) {
	this.age = age;
 }
 public char getBloodgroup() {
	return bloodgroup;
 }
 public void setBloodgroup(char bloodgroup) {
	this.bloodgroup = bloodgroup;
 }
 public Integer getHeight() {
	return height;
 }
 public void setHeight(Integer height) {
	this.height = height;
 }
 public Integer getWeight() {
	return weight;
 }
 public void setWeight(Integer weight) {
	this.weight = weight;
 }
 public Integer getPincode() {
	return pincode;
 }
 public void setPincode(Integer pincode) {
	this.pincode = pincode;
 }
 public String getProfilePhoto() {
	return profilePhoto;
 }
 public void setProfilePhoto(String profilePhoto) {
	this.profilePhoto = profilePhoto;
 }
 public PatientProfile(Integer userid, String name, String address, Integer phone, boolean ismale, byte age,
		char bloodgroup, Integer height, Integer weight, Integer pincode, String profilePhoto) {
	super();
	this.userid = userid;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.ismale = ismale;
	this.age = age;
	this.bloodgroup = bloodgroup;
	this.height = height;
	this.weight = weight;
	this.pincode = pincode;
	this.profilePhoto = profilePhoto;
 }
 @Override
 public String toString() {
	return "PatientProfile [userid=" + userid + ", name=" + name + ", address=" + address + ", phone=" + phone
			+ ", ismale=" + ismale + ", age=" + age + ", bloodgroup=" + bloodgroup + ", height=" + height + ", weight="
			+ weight + ", pincode=" + pincode + ", profilePhoto=" + profilePhoto + "]";
 }
 
 
}
