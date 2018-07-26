package co.paulfran.paulfranco.stackoverflowtopfive.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UsersReceived {

    // List Of Users Received from API
    @SerializedName("items")
    private List<User> users;

    // Getters and setters
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
