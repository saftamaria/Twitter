package com.sda.anto;

public class Main {

    public static void main(String[] args) {
        TwitterPlatform twitterPlatform = new TwitterPlatform();

        User alina = new User("alina");
        User sda = new User("sda");

        twitterPlatform.addUser(alina);
        twitterPlatform.addUser(sda);

        twitterPlatform.addMessageToUser(alina, new Tweet("testing"));
        twitterPlatform.addMessageToUser(alina, new Tweet("another test"));
        twitterPlatform.addMessageToUser(alina, new Tweet("something else"));
        twitterPlatform.addMessageToUser(sda, new Tweet("testing something"));

        twitterPlatform.showAllMessageFromUser(alina);
        twitterPlatform.searchAndPrintMessages("test");

    }
}
