package ge.ibsu.demo.repositories;

import ge.ibsu.demo.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository  extends JpaRepository<Language, Long> {

}
