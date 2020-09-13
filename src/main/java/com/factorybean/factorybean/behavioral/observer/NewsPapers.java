package com.factorybean.factorybean.behavioral.observer;

public class NewsPapers  implements Papers{
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

}
