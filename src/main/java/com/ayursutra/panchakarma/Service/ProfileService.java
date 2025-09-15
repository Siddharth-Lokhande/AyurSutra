package com.ayursutra.panchakarma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayursutra.panchakarma.Model.DoctorProfile;
import com.ayursutra.panchakarma.Model.PatientProfile;
import com.ayursutra.panchakarma.Repository.AuthenRepo;
import com.ayursutra.panchakarma.Repository.ProfilePatientRepo;
import com.ayursutra.panchakarma.Repository.ProfleDocterRepo;

@Service
public class ProfileService {
	@Autowired
	ProfilePatientRepo patientRepo;
	@Autowired
	ProfleDocterRepo doctorRepo;

	public void addPatientProfile(PatientProfile profile) {
		patientRepo.save(profile);
	}

	public void addDoctorProfile(DoctorProfile profile) {
		doctorRepo.save(profile);
	}

	public void updateDoctorProfile(DoctorProfile profile) {
		doctorRepo.save(profile);
	}

	public void updatePatientProfile(PatientProfile profile) {
		patientRepo.save(profile);
	}

	public DoctorProfile getDoctorProfile() {
		// This method should ideally take an id as parameter, but keeping as is for now
		return doctorRepo.findAll().stream().findFirst().orElse(null);
	}

	public PatientProfile getPatientProfile() {
		// This method should ideally take an id as parameter, but keeping as is for now
		return patientRepo.findAll().stream().findFirst().orElse(null);
	}

	public void deletePatientProfile(int id) {
		patientRepo.deleteById(id);
	}

	public void deleteDoctorProfile(int id) {
		doctorRepo.deleteById(id);
	}

}