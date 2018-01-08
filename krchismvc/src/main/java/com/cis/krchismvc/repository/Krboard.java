package com.cis.krchismvc.repository;

public class Krboard {
    private Long id;
    private String title;
    private String contents;
    private int answercount;
    private String createDate;
    private long createuserId;
    private String modifyDate;
    private long modifyUserIid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getAnswercount() {
        return answercount;
    }

    public void setAnswercount(int answercount) {
        this.answercount = answercount;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public long getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(long createuserId) {
        this.createuserId = createuserId;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public long getModifyUserIid() {
        return modifyUserIid;
    }

    public void setModifyUserIid(long modifyUserIid) {
        this.modifyUserIid = modifyUserIid;
    }
}
