package com.nology.backend;

import java.util.Random;

public class Competition {

    private long id = new Random().nextLong();
    private String imgURL;
    private String compName;
    private String location;
    private String date;
    private String registryDedline;
    private long fee;
    private long competitiorsLimit;
    private boolean requireQualify;
    private String email;

    public Competition(long id, String imgURL, String compName, String location, String date, String registryDedline, long fee, long competitiorsLimit, boolean requireQualify, String email) {
        this.id = id;
        this.imgURL = imgURL;
        this.compName = compName;
        this.location = location;
        this.date = date;
        this.registryDedline = registryDedline;
        this.fee = fee;
        this.competitiorsLimit = competitiorsLimit;
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

    public String getRegistryDedline() {
        return registryDedline;
    }

    public void setRegistryDedline(String registryDedline) {
        this.registryDedline = registryDedline;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getCompetitiorsLimit() {
        return competitiorsLimit;
    }

    public void setCompetitiorsLimit(long competitiorsLimit) {
        this.competitiorsLimit = competitiorsLimit;
    }

    public boolean isRequireQualify() {
        return requireQualify;
    }

    public void setRequireQualify(boolean requireQualify) {
        this.requireQualify = requireQualify;
    }
}
