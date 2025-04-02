package hr_portal.hr_portal.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.lang.String;

@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
}