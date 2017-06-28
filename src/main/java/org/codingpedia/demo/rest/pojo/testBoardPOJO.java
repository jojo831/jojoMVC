package org.codingpedia.demo.rest.pojo;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.JPAEntity.boardEntity3;
import org.codingpedia.demo.rest.resource.PodcastDetailedView;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by mason on 2017/6/1.
 */
@SuppressWarnings("restriction")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class testBoardPOJO implements Serializable {
    private static final long serialVersionUID = 5969025246283245616L;

    /**
     * id of the podcast
     */
    @XmlElement(name = "serial_number ")
    private Long id;

    @XmlElement(name = "vessel描述 ")
    @PodcastDetailedView
    private String vessels;

    @XmlElement(name = "mask描述 ")
    @PodcastDetailedView
    private String mask;

    @XmlElement(name = "tab1 ")
    @PodcastDetailedView
    private String tab1;

    @XmlElement(name = "tab2 ")
    @PodcastDetailedView
    private String tab2;

    @XmlElement(name = "tab3 ")
    @PodcastDetailedView
    private String tab3;

    public testBoardPOJO() {
    }

    public testBoardPOJO(boardEntity3 bd) {
        try {
            BeanUtils.copyProperties(this, bd);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public testBoardPOJO(Long id, String vessels, String mask, String tab1, String tab2, String tab3) {
        this.id = id;
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
