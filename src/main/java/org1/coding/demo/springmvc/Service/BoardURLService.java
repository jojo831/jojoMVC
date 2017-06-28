package org1.coding.demo.springmvc.Service;

import org1.coding.demo.springmvc.FACADE.Podcast2;

import java.util.List;

/**
 * Created by mason on 2017/5/26.
 */
public interface BoardURLService {

    public List<Podcast2> getBoardURL();

    public void saveBoardURL(String combineURL,String sqlQuery);
}
