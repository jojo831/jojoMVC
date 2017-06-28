package org.codingpedia.demo.rest.pojo;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.JPAEntity.testEntity;
import org.codingpedia.demo.rest.helpers.DateISO8601Adapter;
import org.codingpedia.demo.rest.resource.PodcastDetailedView;

/**
 * Podcast resource placeholder for json/xml representation
 *
 * @author ama
 */
@SuppressWarnings("restriction")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Podcast1 implements Serializable {


    private static final long serialVersionUID = -8171963665202777776L;
    /**
     * id of the podcast
     */
    @XmlElement(name = "serial_number ")
    private Long id;

    @XmlElement(name = "url信息描述 ")
    @PodcastDetailedView
    private String url_description;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @XmlElement(name = "所关联的url地址")
    @PodcastDetailedView
    private String link_on_url;

    /**
     * description of the podcast
     */
    @XmlElement(name = "SQL查询语句")
    @PodcastDetailedView
    private String sql_language;

    /**
     * insertion date in the database
     */
    @XmlElement(name = "insertionDate")
    @XmlJavaTypeAdapter(DateISO8601Adapter.class)
    @PodcastDetailedView
    private Date insertionDate;

    public Podcast1(testEntity podcastEntity) {
        try {
            BeanUtils.copyProperties(this, podcastEntity);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Podcast1(Long id, String url_description, String link_on_url, String sql_language, Date insertionDate) {
        this.id = id;
        this.url_description = url_description;
        this.link_on_url = link_on_url;
        this.sql_language = sql_language;
        this.insertionDate = insertionDate;
    }

    public Podcast1() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl_description() {
        return url_description;
    }

    public void setUrl_description(String url_description) {
        this.url_description = url_description;
    }

    public String getLink_on_url() {
        return link_on_url;
    }

    public void setLink_on_url(String link_on_url) {
        this.link_on_url = link_on_url;
    }

    public String getSql_language() {
        return sql_language;
    }

    public void setSql_language(String sql_language) {
        this.sql_language = sql_language;
    }

    public Date getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(Date insertionDate) {
        this.insertionDate = insertionDate;
    }
}
