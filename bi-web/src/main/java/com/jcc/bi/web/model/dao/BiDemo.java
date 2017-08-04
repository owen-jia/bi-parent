package com.jcc.bi.web.model.dao;

import javax.persistence.*;

@Table(name = "bi_demo")
public class BiDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descs;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return descs
     */
    public String getDescs() {
        return descs;
    }

    /**
     * @param descs
     */
    public void setDescs(String descs) {
        this.descs = descs == null ? null : descs.trim();
    }
}