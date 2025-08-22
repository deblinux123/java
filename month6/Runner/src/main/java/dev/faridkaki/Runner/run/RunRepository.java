package dev.faridkaki.Runner.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository 
{
    private final List<Run> runs = new ArrayList<>();
    
    
    List<Run> findAll()
    {
        return runs;
    }

    Optional<Run> findById(Integer id)
    {
        return runs.stream()
                    .filter(run -> Objects.equals(run.id(), id))
                    .findFirst();
    }

    void createRun(Run run)
    {
        runs.add(run);
    }

    void update(Run run, Integer id)
    {
        Optional<Run> existingRun = findById(id);
        existingRun.ifPresent(value -> runs.set(runs.indexOf(value), run));
    }

    void delete(Integer id)
    {
        runs.removeIf(run -> run.id().equals(id));
    }

    @PostConstruct
    private void init()
    {
        runs.add(new Run(1, "Monday morning",
            LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(30),
            3,
            Location.INDOOR));
        runs.add(new Run(2, "Wednesday Run",
            LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(60),
            5,
            Location.INDOOR));
        runs.add(new Run(3, "Sunset Jog",
            LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(34)
            , 4,
             Location.OUTDOOR));

        runs.add(new Run(4, "Sunday Morning", LocalDateTime.now(), LocalDateTime.now().plusMinutes(60), 3, Location.OUTDOOR));

    }


}
