package com.factorybean.factorybean.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Papers> channels = new ArrayList<>();

    public void addObserver(Papers channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Papers channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Papers channel : this.channels) {
            channel.update(this.news);
        }
    }
}
