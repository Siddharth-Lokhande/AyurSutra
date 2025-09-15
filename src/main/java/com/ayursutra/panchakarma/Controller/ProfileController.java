package com.ayursutra.panchakarma.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ayursutra.panchakarma.Repository.AuthenMongoRepo;
import com.ayursutra.panchakarma.Model.DoctorProfile;
import com.ayursutra.panchakarma.Model.PatientProfile;
import com.ayursutra.panchakarma.Service.ProfileService;

@RestController
public class ProfileController {
	@Autowired
	ProfileService profileService;
	
	@PostMapping("/patientprofile")
	public void addpuser(@RequestBody PatientProfile profile) {
		profileService.addPatientProfile(profile);
	}
	@PostMapping("/doctorprofile")
	public void addduser(@RequestBody DoctorProfile profile) {
		profileService.addDoctorProfile(profile);
	}
	@PutMapping("/doctorprofile")
	public void updatepuser(@RequestBody DoctorProfile profile) {
		profileService.updateDoctorProfile(profile);
	}
	@PutMapping("/patientprofile")
	public void updateduser(@RequestBody PatientProfile profile) {
		profileService.updatePatientProfile(profile);
	}
	@GetMapping("/doctorprofile")
	public DoctorProfile getdoctoruser() {
		return profileService.getDoctorProfile();
	}
	@GetMapping("/patientprofile")
	public PatientProfile getpatientuser() {
		return profileService.getPatientProfile();
	}
	@DeleteMapping("/patientprofile")
	public void deletepuser(@PathVariable int id) {
		profileService.deletePatientProfile(id);
	}
	@DeleteMapping("/doctorprofile")
	public void deleteduser(@PathVariable int id) {
		profileService.deleteDoctorProfile(id);

	}
	
}
