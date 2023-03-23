package com.nology.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//A specialised annotation for service bean.
public class CompetitionService {

    @Autowired
    //Used to Inject Dependencies into a class in different ways, instance variable,
    // constructor and methods. If you have one implementation and the field name
    // matches the class name it can do the wiring automatically.
    CompetitionRepository competitionRepository;

    //Create
    public void addCompetition (Competition competition){
        competitionRepository.addCompetition(competition);
    }

    // READ

    public Competition getCompetitionById(int id){
        return competitionRepository.getCompetitionById(id);
    }
    //random is genereted in method getRandomCompetition
    public Competition getCompetitionByRandomID(){
        return competitionRepository.getRandomCompetition();
    }

    public List<Competition> getAllCompetitions(){
        return competitionRepository.getAllCompetitions();
    }

    //Update
    public void updateCompetition(Competition competition, int id){
        competitionRepository.updateCompetition(competition,id);
    }

    //Delete
    public void deleteCompetitionByID(int id){
        competitionRepository.deleteCompetition(id);
    }
}




