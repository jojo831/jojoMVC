package org1.coding.demo.springmvc.Service.impl;

import org.codingpedia.demo.rest.JPAEntity.testEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org1.coding.demo.springmvc.YtDao.TestDAO;
import org1.coding.demo.springmvc.FACADE.Podcast2;
import org1.coding.demo.springmvc.Service.BoardURLService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mason on 2017/5/26.
 */
public class BoardURLServiceIMPL implements BoardURLService {

    @Autowired
    private TestDAO testDAO;

    @Override
    public List<Podcast2> getBoardURL() {
        List<testEntity> podcasts = testDAO.getPodcasts1();
        return getPodcastsFromEntities1(podcasts);
    }

    @Override
    public void saveBoardURL(String combineURL, String sqlQuery) {
        try {
            testDAO.saveBoardURL(combineURL,sqlQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Podcast2> getPodcastsFromEntities1(List<testEntity> podcastEntities) {
        List<Podcast2> response = new ArrayList<Podcast2>();
        for(testEntity ts : podcastEntities){
            response.add(new Podcast2(ts));
        }

        return response;
    }
}
