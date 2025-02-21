package ge.ibsu.demo.services;

import ge.ibsu.demo.dto.projections.ActorDTO;
import ge.ibsu.demo.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    public List<ActorDTO> getAllActors() {
        List<Object[]> results = actorRepository.findAllFirstAndLastNames();
        List<ActorDTO> actors = new ArrayList<>();
        for (Object[] result : results) {
            actors.add(new ActorDTO((String) result[0], (String) result[1]));
        }
        return actors;
    }
}
