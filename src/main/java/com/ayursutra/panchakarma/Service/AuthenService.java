package com.ayursutra.panchakarma.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayursutra.panchakarma.Model.Authen;
import com.ayursutra.panchakarma.Model.AuthenMongo;
import com.ayursutra.panchakarma.Repository.AuthenMongoRepo;
import com.ayursutra.panchakarma.Repository.AuthenRepo;
@Service
public class AuthenService {
	@Autowired
	AuthenRepo authenRepo;
	AuthenMongoRepo authenMongoRepo;
		public String registerUser(Authen authen) {
			authen.setUserid(generateid()); int id=authen.getUserid();
			AuthenMongo authenMongo=new AuthenMongo(id);
			authenMongoRepo.save(authenMongo);
			if (authen.getEmail() != null && authenRepo.findByEmail(authen.getEmail()).isPresent()) {
				return "{ \"email\": false }";
			}
			// Check for existing username
			else if (authen.getUsername() != null && authenRepo.findByUsername(authen.getUsername()).isPresent()) {
				return "{ \"username\": false }";
			}
			// Check for null password
			else if (authen.getPassword() == null || authen.getPassword().trim().isEmpty()) {
				return "{ \"password\": false }";
			}
			else {
			// If all checks pass, save the new user
			authenRepo.save(authen);
			return "{ \"verification\": true }";
		}
	}
		public Boolean login(Authen authen) {
			Boolean mail=false;Boolean pass=false;Boolean usid=false;
			if (authen.getEmail() != null && authenRepo.findByEmail(authen.getEmail()).isPresent()) {
				mail= true;
			}
			if (authen.getUsername() != null && authenRepo.findByUsername(authen.getUsername()).isPresent()) {
				usid=true;
			}
			if (authen.getPassword() != null && authenRepo.findByPassword(authen.getPassword()).isPresent()) {
				pass=true;
			} 
			if ((mail || usid)&& pass) {
				return true;
			}
			else {
				return false;
			}
		}
		public void deleteuser(int id) {
			authenRepo.deleteById(id);
		}
		public void updatepassword(Authen authen) {
				authen.setPassword(authen.getPassword());
				authenRepo.save(authen);
			}
		public int generateid() {
			int randomValue;
			while (true) {
				randomValue = (int)(Math.random() * (1000)+1 );
				if (authenRepo.findById(randomValue).isEmpty()) {
					break;
				}
			}
			return randomValue;
		}
		}
