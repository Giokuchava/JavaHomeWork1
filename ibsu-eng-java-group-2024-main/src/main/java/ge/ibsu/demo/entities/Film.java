package ge.ibsu.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String rating;
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
}
