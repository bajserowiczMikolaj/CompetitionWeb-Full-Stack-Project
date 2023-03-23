package com.nology.backend;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.time.LocalDate;
@Component
public class CompetitionInitializer {
    private final CompetitionRepository competitionRepository;

    @Value("classpath:Competition.json")
    private Resource resourceFile;

    @Autowired
    public CompetitionInitializer(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }


    @PostConstruct
    public void init() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(resourceFile.getFile())) {
            Object obj = jsonParser.parse(reader);

            JSONArray jsonArray = (JSONArray) obj;

            for (Object competition : jsonArray) {
                JSONObject competitionJSON = (JSONObject) competition;


               // double is not a type recognized by JSON schema.
                // JSON schema defines the following data types: string , number , integer , object , array , boolean and null .
                // There are two numeric types: integer and number .
                // If your numbers are not integral numbers then number is the type you need

                long id =(long)competitionJSON.get("id");
                String compName = (String) competitionJSON.get("compName");
                String imgURL = (String) competitionJSON.get("imgURL");
                String location = (String) competitionJSON.get("location");
                String date = (String) competitionJSON.get("date");
                String registryDedline = (String) competitionJSON.get("registryDedline");
                long fee = (long) competitionJSON.get("fee");
                long competitiorsLimit = (long) competitionJSON.get("competitiorsLimit");
                boolean requireQualify = (boolean) competitionJSON.get("requireQualify");
              //  LocalDate dateCreated = LocalDate.parse((String) competitionJSON.get("date_created"));

                competitionRepository.addCompetition(new Competition(id,compName,imgURL,location,date,registryDedline,fee,competitiorsLimit,requireQualify));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
