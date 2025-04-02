package hr_portal.hr_portal.controller;

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

import hr_portal.hr_portal.entity.Employee;
import hr_portal.hr_portal.service.EmployeeService;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
   

    //This is to Create the Employee;
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
          return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    //This is to Get all the Employee;
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
    
    //This is to Delete the Employee;
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee Delete Sucessfully");
    }

    //We have to implement the update employee;

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee updatedEmployee){
                   Employee employee=employeeService.udpateEmployee(id, updatedEmployee);
                   return ResponseEntity.ok(employee);
    }


}
