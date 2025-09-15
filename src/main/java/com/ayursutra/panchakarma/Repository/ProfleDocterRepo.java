package com.ayursutra.panchakarma.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayursutra.panchakarma.Model.DoctorProfile;
@Repository
public interface ProfleDocterRepo extends JpaRepository<DoctorProfile, Integer>{

}
