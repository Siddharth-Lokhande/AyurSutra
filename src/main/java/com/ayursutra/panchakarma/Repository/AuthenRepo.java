package com.ayursutra.panchakarma.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ayursutra.panchakarma.Model.Authen;

import java.util.Optional;
@Repository
public interface AuthenRepo extends JpaRepository<Authen, Integer>{
	 Optional<Authen> findByEmail(String email);
	 Optional<Authen> findByPassword(String password);
	    Optional<Authen> findByUsername(String username);
}