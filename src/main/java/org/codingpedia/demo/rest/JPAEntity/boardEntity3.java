package org.codingpedia.demo.rest.JPAEntity;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.pojo.testBoardPOJO;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by mason on 2017/6/1.
 */
@Entity
@Table(name = "board_company3")
public class boardEntity3 implements Serializable{
    private static final long serialVersionUID = 2210447181810043191L;

    /**
     * id of the podcast
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @Column(name = "vessels")
    private String vessels;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @Column(name = "mask")
    private String mask;

    @Column(name = "tab1")
    private String tab1;

    @Column(name = "tab2")
    private String tab2;

    @Column(name = "tab3")
    private String tab3;

    public boardEntity3() {
    }

    public boardEntity3(testBoardPOJO bo) {
        try {
            BeanUtils.copyProperties(this, bo);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boardEntity3(String vessels, String mask, String tab1, String tab2, String tab3) {
        this.vessels = vessels;
        this.mask = mask;
        this.tab1 = tab1;
        this.tab2 = tab2;
        this.tab3 = tab3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVessels() {
        return vessels;
    }

    public void setVessels(String vessels) {
        this.vessels = vessels;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getTab1() {
        return tab1;
    }

    public void setTab1(String tab1) {
        this.tab1 = tab1;
    }

    public String getTab2() {
        return tab2;
    }

    public void setTab2(String tab2) {
        this.tab2 = tab2;
    }

    public String getTab3() {
        return tab3;
    }

    public void setTab3(String tab3) {
        this.tab3 = tab3;
    }
}
