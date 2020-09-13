package com.factorybean.factorybean.behavior;

import com.factorybean.factorybean.behavioral.observer.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObserverIntegrationTest {

    @Test
    public void whenChangingNewsAgencyState_thenNewsChannelNotified() {

        NewsAgency observable = new NewsAgency();
        NewsPapers observer = new NewsPapers();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingONewsAgencyState_thenONewsChannelNotified() {

        ONewsAgency observable = new ONewsAgency();
        ONewsPapers observer = new ONewsPapers();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsPapers observer = new PCLNewsPapers();

        observable.addPropertyChangeListener(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}