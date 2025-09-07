package com.ayursutra.panchakarma.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ayursutra.panchakarma.Model.Authen;
@Repository
public interface AuthenRepo extends JpaRepository<Authen, Integer>{
}
