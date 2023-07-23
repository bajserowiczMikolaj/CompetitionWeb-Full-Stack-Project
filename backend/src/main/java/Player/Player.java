package Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long playerId;
    private String name;
    private String surname;
    private String club;
    private String afilation;
    private String nationality;
    private String DoB;
    private String belt;
    private String division;

    public Player() {
    }

    public Player(long playerId, String name, String surname, String club, String afilation, String nationality, String doB, String belt, String division) {
        this.playerId = playerId;
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.afilation = afilation;
        this.nationality = nationality;
        this.DoB = doB;
        this.belt = belt;
        this.division = division;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getAfilation() {
        return afilation;
    }

    public void setAfilation(String afilation) {
        this.afilation = afilation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}