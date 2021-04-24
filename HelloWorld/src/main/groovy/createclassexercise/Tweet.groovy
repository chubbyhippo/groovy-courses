package createclassexercise

import groovy.transform.ToString

@ToString
class Tweet {
    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    Tweet(String username, String text) {
        this.username = username
        this.text = text
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    void addToRetweets(){
        retweets++
    }

    void addToFavorites(){
        favorites++
    }
}
