package com.ayursutra.panchakarma.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Document
@Component
public class DoctorProfile {
	@Id
	 private Integer id;
	 private String name;
	 private String address;
	 private Integer phone;
	 private boolean ismale;
	 private String qualification;
	 private String expertise;
	 private int yearsOfExperience;
	 private Integer pincode;
	 private String profilePhoto;
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
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
	 public String getQualification() {
		 return qualification;
	 }
	 public void setQualification(String qualification) {
		 this.qualification = qualification;
	 }
	 public String getExpertise() {
		 return expertise;
	 }
	 public void setExpertise(String expertise) {
		 this.expertise = expertise;
	 }
	 public int getYearsOfExperience() {
		 return yearsOfExperience;
	 }
	 public void setYearsOfExperience(int yearsOfExperience) {
		 this.yearsOfExperience = yearsOfExperience;
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
	 public DoctorProfile(Integer id, String name, String address, Integer phone, boolean ismale, String qualification,
			String expertise, int yearsOfExperience, Integer pincode, String profilePhoto) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.ismale = ismale;
		this.qualification = qualification;
		this.expertise = expertise;
		this.yearsOfExperience = yearsOfExperience;
		this.pincode = pincode;
		this.profilePhoto = profilePhoto;
	}
	 @Override
	 public String toString() {
		return "DoctorProfile [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", ismale="
				+ ismale + ", qualification=" + qualification + ", expertise=" + expertise + ", yearsOfExperience="
				+ yearsOfExperience + ", pincode=" + pincode + ", profilePhoto=" + profilePhoto + "]";
	 }
}
