package ge.ibsu.demo.services;

import ge.ibsu.demo.dto.projections.CityDTO;
import ge.ibsu.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityDTO> getAllCities() {
        List<Object[]> results = cityRepository.findAllCityAndCountryNames();
        List<CityDTO> cities = new ArrayList<>();
        for (Object[] result : results) {
            cities.add(new CityDTO((String) result[0], (String) result[1]));
        }
        return cities;
    }
}