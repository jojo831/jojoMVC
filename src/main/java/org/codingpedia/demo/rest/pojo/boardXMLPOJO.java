package org.codingpedia.demo.rest.pojo;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.JPAEntity.boardEntity;
import org.codingpedia.demo.rest.resource.PodcastDetailedView;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by mason on 2017/5/27.
 */
@SuppressWarnings("restriction")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class boardXMLPOJO implements Serializable {
    private static final long serialVersionUID = 5614792781046378759L;

    /**
     * id of the podcast
     */
    @XmlElement(name = "serial_number ")
    private Long id;

    @XmlElement(name = "vessel描述 ")
    @PodcastDetailedView
    private String vessel;

    @XmlElement(name = "mask描述 ")
    @PodcastDetailedView
    private String mask;

    @XmlElement(name = "backupcolumn描述 ")
    @PodcastDetailedView
    private String backupcolumn;

    public boardXMLPOJO(){}

    public boardXMLPOJO(boardEntity bd) {
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

    public boardXMLPOJO(Long id, String vessel, String mask, String backupcolumn) {
        this.id = id;
        this.vessel = vessel;
        this.mask = mask;
        this.backupcolumn = backupcolumn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getBackupcolumn() {
        return backupcolumn;
    }

    public void setBackupcolumn(String backupcolumn) {
        this.backupcolumn = backupcolumn;
    }
}
