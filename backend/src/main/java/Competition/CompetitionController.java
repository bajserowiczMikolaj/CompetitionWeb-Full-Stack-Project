package Competition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class CompetitionController {

    public CompetitionController() {
    }

    @Autowired
    CompetitionService competitionService;

    @ExceptionHandler
    public ResponseEntity<String> handleExceptions(CompetitionNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @PostMapping("/competition")
    public Competition createCompetition(@RequestBody Competition competition) {
        competitionService.addCompetition(competition);
        return competition;
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World! Communication ok";
    }

    @GetMapping("/competitions")
    public List<Competition> getCompetition() {
        return competitionService.getAllCompetitions();

    }

    @GetMapping("/competition/random")
    public Competition getRandomCompetition() {
        return competitionService.getRandomCompetition();
    }

    @GetMapping("/competition/{id}")
    public Optional<Competition> getCompetitionById(@PathVariable long id) {
        return competitionService.getCompetitionById(id);
    }

    @PutMapping("/competition/{id}")
    public Competition updateCompetition(@RequestBody Competition newCompetition, @PathVariable long id){
        newCompetition.setId(id);
        competitionService.updateCompetition(newCompetition,id);
        return newCompetition;
    }


    @DeleteMapping("/competition/{id}")
    @Transactional
    public String deleteCompetitionById(@PathVariable long id) {
        competitionService.deleteCompetitionById(id);
        return "Deleted Competition";
    }
}
