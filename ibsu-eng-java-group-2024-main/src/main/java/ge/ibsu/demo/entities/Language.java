package ge.ibsu.demo.entities;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "language")
    private Set<Film> films;

}
