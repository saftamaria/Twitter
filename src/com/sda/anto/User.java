package com.sda.anto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {

    private String userName;
    private List<Tweet> messages;

    public User(String userName) {
        this.userName = userName;
        messages = new ArrayList<>();
    }

    public void addMessage(Tweet tweet) {
        messages.add(tweet);
    }

    public List<Tweet> searchMessages(String query) {
        return messages.stream().filter(tweet -> tweet.getMessage().contains(query)).collect(Collectors.toList());
    }

    public List<Tweet> getMessages() {
        return messages;
    }

    public String getUserName() {
        return userName;
    }

}
