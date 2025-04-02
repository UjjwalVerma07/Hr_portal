package hr_portal.hr_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr_portal.hr_portal.service.UserService;
import hr_portal.hr_portal.entity.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    @Autowired
    UserService userservice;


//This is the Post Mapping to Create User;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
      return ResponseEntity.ok(userservice.createUser(user));
    }

    //This is the Get Mapping to Get the User;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userservice.getAllUsers());
    }

    //This is to Delete the User;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
         userservice.deleteUser(id);
         return ResponseEntity.ok("User Deleted Successfully");
    }

    //This is to Update User;
    // @PutMapping("/{id}")
    // public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
    //             User user=userservice.updateUser(id,user);
    //             return ResponseEntity.ok(user);
    // }


}
