package com.nology.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CompetitionController {

    @Autowired
    CompetitionRepository competitionRepository;


    //crete

    @PostMapping("/competitions")
    public Competition createCompetition(@RequestBody Competition competition){
        competitionRepository.addCompetition(competition);
        // run email using competition.get email etc when registry
        return competition;
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World! Comunication ok";
    }

    @GetMapping("/allCompetitions")
    public List<Competition> getCompetition() {
        return competitionRepository.getAllCompetitions();
    }

    @GetMapping("/competition/random")
    public Competition getRandomCompetition() {
        return competitionRepository.getRandomCompetition();
    }

    @GetMapping("/competition/{id}")
    public Competition getCompetionById(@PathVariable int id) {
        return competitionRepository.getCompetitionById(id);
    }

    // UPDATE

    @PutMapping("/competition/{id}")
    public Competition updateCompetition(@RequestBody Competition newCompetition, @PathVariable int id){
        newCompetition.setId(id);
        competitionRepository.updateCompetition(newCompetition,id);
        return newCompetition;
    }

    // DELETE

    @DeleteMapping("/competition/{id}")
    public String deleteCompetitionById(@PathVariable int id) {
        competitionRepository.deleteCompetition(id);
        return "Deleted Competition";
    }
}
