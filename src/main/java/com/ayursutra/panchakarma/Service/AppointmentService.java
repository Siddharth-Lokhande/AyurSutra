package com.ayursutra.panchakarma.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayursutra.panchakarma.Model.Appointment;
import com.ayursutra.panchakarma.Repository.AppointmentRepo;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepo repo;

    /**
     * Display all appointments.
     * @return List of all appointments
     */
    public List<Appointment> getAllAppointments() {
        return repo.findAll();
    }

    /**
     * Display appointment by ID.
     * @param aptId Appointment ID
     * @return Appointment object or new Appointment if not found
     */
    public Appointment getAppointmentById(int aptId) {
        return repo.findById(aptId).orElse(new Appointment());
    }

    /**
     * Create a new appointment.
     * @param appointment Appointment object to create
     */
    public void createAppointment(Appointment appointment) {
        repo.save(appointment);
    }

    /**
     * Update an existing appointment.
     * @param appointment Appointment object to update
     */
    public void updateAppointment(Appointment appointment) {
        repo.save(appointment);
    }

    /**
     * Delete an appointment by ID.
     * @param aptId Appointment ID to delete
     */
    public void deleteAppointment(int aptId) {
        repo.deleteById(aptId);
    }
}