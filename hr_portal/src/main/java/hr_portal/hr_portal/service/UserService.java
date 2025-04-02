package hr_portal.hr_portal.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr_portal.hr_portal.entity.User;
import hr_portal.hr_portal.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Create User;
    public User createUser(User user){
            return userRepository.save(user);
    }

    //Get All User;
    public List <User>getAllUsers(){
        return userRepository.findAll();
    }

    //Get By User Id;
    public Optional<User>getUserById(Long id){
        return userRepository.findById(id);
    }

    //Delete User;
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
