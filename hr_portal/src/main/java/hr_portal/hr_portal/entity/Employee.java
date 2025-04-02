package hr_portal.hr_portal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String department;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private Long salary;

}
