package com.ayursutra.panchakarma.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ayursutra.panchakarma.Model.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Product, Integer> {

}

