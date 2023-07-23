package Competition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompetitionService {

    @Autowired
    CompetitionRepository competitionRepository;

    public CompetitionService() {
    }

    public void addCompetition(Competition competition){
        competitionRepository.save(competition);
    }

    public Optional<Competition> getCompetitionById(long id) {
        if(!competitionRepository.existsById(id)){
            throw new CompetitionNotFoundException();
        }
        return competitionRepository.findById(id);
    }

    public Competition getRandomCompetition() {
        return competitionRepository.getRandomCompetition();
    }

    public List<Competition> getAllCompetitions() {
        return new ArrayList<>(competitionRepository.findAll());
    }

    public void updateCompetition(Competition newCompetition, long id) {
        if (!competitionRepository.existsById(id)) {
            throw new CompetitionNotFoundException();
        }
        newCompetition.setId(id);
        competitionRepository.save(newCompetition);
    }
    @Transactional
    public void deleteCompetitionById(long id) {
        if (!competitionRepository.existsById(id)) {
            throw new CompetitionNotFoundException();
        }
        competitionRepository.deleteCompetitionById(id);
    }
}


