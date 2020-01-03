package com.sample.bi.model;

/**
 * @author: Owen Jia
 * @time: 2018/10/11 16:06
 */
public class MemberInfo {
    Long id;
    String code;
    String fullName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
