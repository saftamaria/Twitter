package com.sda.anto;

public class Tweet {

    private String message;

    public Tweet(String message) {
        if (message.length() < 140) {
            this.message = message;
        } else {
            throw new IllegalArgumentException("The message is too long");
        }
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "[Tweet: message = " + message + "]";
    }

}
