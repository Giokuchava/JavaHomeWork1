package ge.ibsu.demo.controllers;

import ge.ibsu.demo.dto.projections.CityDTO;
import ge.ibsu.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/names")
    public List<CityDTO> getAllCities() {
        return cityService.getAllCities();
    }
}