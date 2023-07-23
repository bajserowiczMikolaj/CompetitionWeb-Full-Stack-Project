package Competition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity// it is used to represent a table in a database as a Java class.
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String imgURL;
    private String compName;
    private String location;
    private String date;
    private String registryDeadline;
    private long fee;
    private long competitorLimit;
    private boolean requireQualify;
    private String email;

    public Competition() {};


    public Competition(long id, String imgURL, String compName, String location, String date, String registryDeadline, long fee, long competitorLimit, boolean requireQualify, String email) {
        this.id = id;
        this.imgURL = imgURL;
        this.compName = compName;
        this.location = location;
        this.date = date;
        this.registryDeadline = registryDeadline;
        this.fee = fee;
        this.competitorLimit = competitorLimit;
        this.requireQualify = requireQualify;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }


    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRegistryDeadline() {
        return registryDeadline;
    }

    public void setRegistryDeadline(String registryDeadline) {
        this.registryDeadline = registryDeadline;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getCompetitorLimit() {
        return competitorLimit;
    }

    public void setCompetitorLimit(long competitorLimit) {
        this.competitorLimit = competitorLimit;
    }

    public boolean isRequireQualify() {
        return requireQualify;
    }

    public void setRequireQualify(boolean requireQualify) {
        this.requireQualify = requireQualify;
    }

}
