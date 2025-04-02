package hr_portal.hr_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr_portal.hr_portal.dto.LoginRequest;
import hr_portal.hr_portal.service.AuthService;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/users")
public class AuthController {
    @Autowired
    private AuthService authservice;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest request){
        try{
            String responseMessage=authservice.login(request.getEmail(),request.getPassword());
            return ResponseEntity.ok(responseMessage);
        }
        catch(RuntimeException e){
            return ResponseEntity.ok(e);
        }
    }
}
