package org.codingpedia.demo.rest.JPAEntity;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.pojo.Podcast;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by mason on 2017/5/24.
 */
@Entity
@Table(name = "querysql_relation_url")
public class testEntity implements Serializable {
    private static final long serialVersionUID = -367465500111649791L;

    /**
     * id of the podcast
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @Column(name = "url_description")
    private String url_description;

    /**
     * url of the feed
     */
    @Column(name = "link_on_url")
    private String link_on_url;

    /**
     * description of the podcast
     */
    @Column(name = "sql_language")
    private String sql_language;

    /**
     * insertion date in the database
     */
    @Column(name = "insertion_date")
    private Date insertionDate;

    public testEntity() {
    }

    public testEntity(String url_description, String link_on_url, String sql_language, Date insertionDate) {
        this.url_description = url_description;
        this.link_on_url = link_on_url;
        this.sql_language = sql_language;
        this.insertionDate = insertionDate;
    }

    public testEntity(Podcast podcast) {
        try {
            BeanUtils.copyProperties(this, podcast);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
