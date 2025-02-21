package ge.ibsu.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
}
