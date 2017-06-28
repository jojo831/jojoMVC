package org1.coding.demo.springmvc.DAO;

import org.codingpedia.demo.rest.JPAEntity.testEntity;

import java.util.List;

/**
 * Created by mason on 2017/5/26.
 */
public interface TestDAO {

    public List<testEntity> getPodcasts1();

    public void saveBoardURL(String combineURL,String sqlQuery) throws Exception;
}
