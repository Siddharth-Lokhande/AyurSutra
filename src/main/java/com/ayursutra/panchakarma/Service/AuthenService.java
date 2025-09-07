package com.ayursutra.panchakarma.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayursutra.panchakarma.Model.Authen;
import com.ayursutra.panchakarma.Repository.AppointmentRepo;
import com.ayursutra.panchakarma.Repository.AuthenRepo;
@Service
public class AuthenService {
	@Autowired
	AppointmentRepo repo;
	
}
