package com.sda.anto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TwitterPlatform {

    private HashMap<String, User> platform;

    public TwitterPlatform() {
        this.platform = new HashMap<>();
    }

    public void addUser(User user) {
        if (platform.containsKey(user.getUserName())) {
            System.out.println("This username already exists");
        } else {
            platform.put(user.getUserName(), user);
        }
    }

    public void addMessageToUser(User user, Tweet message) {
        if (platform.containsKey(user.getUserName())) {
            platform.get(user.getUserName()).addMessage(message);
        } else System.out.println("the user does not exist");
    }

    public void showAllMessageFromUser(User user) {
        if (platform.containsKey(user.getUserName())) {
            System.out.println(platform.get(user.getUserName()).getMessages());
        } else System.out.println("the user does not exist");
    }

    public boolean isUserAvailable(User user) {
        return platform.containsKey(user.getUserName());
    }

    public void searchAndPrintMessages(String searchQuery) {
        List<String> searchResult = platform.values().stream()
                .map(user -> user.searchMessages(searchQuery).stream().map(Tweet::getMessage).collect(Collectors.toList()))
                .reduce(new ArrayList<String>(), (oldList, newList) -> {
                    oldList.addAll(newList);
                    return oldList;
                });
        System.out.println(searchResult);
    }
}
