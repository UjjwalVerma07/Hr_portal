package hr_portal.hr_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr_portal.hr_portal.repository.EmployeeRepository;
import hr_portal.hr_portal.entity.*;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
     @Autowired
     private EmployeeRepository employeeRepository;

     //This is to Create the Employee
     public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
     }
    
     //This is to get all the Employees;
     public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
     }

     //This is to get Specific employee by id;
     public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
     }

     //This is to delete the Employee;
     public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
     }

     //This is to update the Employee;
     //We have to implement this method;

     public Employee udpateEmployee(Long id,Employee updatedemployee){
        Employee existingemployee=employeeRepository.findById(id).
                               orElseThrow(()->new RuntimeException("Employee not found"));
        existingemployee.setDepartment(updatedemployee.getDepartment());
        existingemployee.setEmail(updatedemployee.getEmail());
        existingemployee.setName(updatedemployee.getName());
        existingemployee.setSalary(updatedemployee.getSalary());
        return employeeRepository.save(existingemployee);
     }



}
