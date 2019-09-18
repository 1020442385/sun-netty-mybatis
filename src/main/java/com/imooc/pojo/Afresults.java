package com.imooc.pojo;

import javax.persistence.*;

public class Afresults {
    @Id
    private String id;

    private String gdsid;

    private String bth;

    private String sn;

    private String clong;

    private String cshort;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return gdsid
     */
    public String getGdsid() {
        return gdsid;
    }

    /**
     * @param gdsid
     */
    public void setGdsid(String gdsid) {
        this.gdsid = gdsid;
    }

    /**
     * @return bth
     */
    public String getBth() {
        return bth;
    }

    /**
     * @param bth
     */
    public void setBth(String bth) {
        this.bth = bth;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return sn;
    }

    /**
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * @return clong
     */
    public String getClong() {
        return clong;
    }

    /**
     * @param clong
     */
    public void setClong(String clong) {
        this.clong = clong;
    }

    /**
     * @return cshort
     */
    public String getCshort() {
        return cshort;
    }

    /**
     * @param cshort
     */
    public void setCshort(String cshort) {
        this.cshort = cshort;
    }
}