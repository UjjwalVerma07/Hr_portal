package hr_portal.hr_portal.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import hr_portal.hr_portal.entity.User;
import hr_portal.hr_portal.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;
    
   public String login(String email,String password){
      Optional<User> userOpt=userRepository.findByEmail(email);
      if(userOpt.isPresent()){
        System.out.println("From database");
        System.out.println(userOpt.get().getEmail());
        System.out.println(userOpt.get().getPassword());

        System.out.println("From Frontend");
        System.out.println(email);
        System.out.println(password);
        if((userOpt.get().getEmail().equals(email)) && (userOpt.get().getPassword().equals(password)))
         return "{\"message\": \"Login Successful\"}";
         
        else{
            throw new RuntimeException("Invalid email or Password");
        }
      }
      else{
        throw new RuntimeException("User Not Found");
      }
   }

}
