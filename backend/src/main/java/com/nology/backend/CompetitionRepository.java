package com.nology.backend;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
//A specialised annotation for persistence bean.
public class CompetitionRepository {

private final List<Competition> competitions = new ArrayList<>();

//Create
    public void addCompetition(Competition competition){
        competitions.add(competition);
    }

//Read
    //goiing by all the elements of the list and if find correct id is gonna return
    public Competition getCompetitionById(int id){
        for (Competition competition:competitions) {
            if (competition.getId() == id){
                return competition;
            }
        }
        return null;
    }

    //return all of the competitions
    public List<Competition>getAllCompetitions(){
        return competitions;
    }

    public Competition getRandomCompetition(){
        Random random = new Random();
        return competitions.get(random.nextInt(competitions.size()));
    }


    //update

    public void updateCompetition (Competition Newcompetition,int id){
        for(int i =0; i<competitions.size(); i++){
            if(competitions.get(i).getId() == i++){
                competitions.set(i,Newcompetition);
                return;
            }
        }
    }

    //Delete

    public void deleteCompetition (int id){
        //looping throught all elements of the list (Competition)
        for(int i =0; i<competitions.size(); i++){
            // when find element with correct id take a index of the element and remove it
            if(competitions.get(i).getId() == i++){
                competitions.remove(i);
                return;
            }
        }
    }




}
