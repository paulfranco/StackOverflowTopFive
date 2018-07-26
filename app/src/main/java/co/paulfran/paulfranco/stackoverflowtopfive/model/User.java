package co.paulfran.paulfranco.stackoverflowtopfive.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class User {

    @SerializedName("location")
    private String location;

    @SerializedName("display_name")
    private String userName;

    @SerializedName("reputation")
    private String reputation;

    @SerializedName("badge_counts")
    private HashMap<String,Integer> badges = new HashMap<>();


    // GETTERS AND SETTERS
    public HashMap<String, Integer> getBadges() {
        return badges;
    }

    public void setBadges(HashMap<String, Integer> badges) {
        this.badges = badges;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}