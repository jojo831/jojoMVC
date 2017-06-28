package org.codingpedia.demo.rest.JPAEntity;

import org.apache.commons.beanutils.BeanUtils;
import org.codingpedia.demo.rest.pojo.boardXMLPOJO;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by mason on 2017/5/27.
 */
@Entity
@Table(name = "board_company1")
public class boardEntity implements Serializable {
    private static final long serialVersionUID = -8994297277806274685L;

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
    @Column(name = "vessel")
    private String vessel;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @Column(name = "mask")
    private String mask;

    /**
     * link of the podcast on Podcastpedia.org
     */
    @Column(name = "backupcolumn")
    private String backupcolumn;

    public boardEntity() {
    }

    public boardEntity(boardXMLPOJO bo) {
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

    public boardEntity(String vessel, String mask, String backupcolumn) {
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
