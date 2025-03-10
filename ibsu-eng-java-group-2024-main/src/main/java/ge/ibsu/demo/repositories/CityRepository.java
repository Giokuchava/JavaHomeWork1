package ge.ibsu.demo.repositories;

import ge.ibsu.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT c.name, c.country.name FROM City c")
    List<Object[]> findAllCityAndCountryNames();
}