package com.ayursutra.panchakarma.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayursutra.panchakarma.Model.PatientProfile;

@Repository
public interface ProfilePatientRepo extends JpaRepository<PatientProfile, Integer>{

}
