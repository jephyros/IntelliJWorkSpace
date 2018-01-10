package com.krchis.bootjsp.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="kr_board")
public class Board {
    @Id
    @GeneratedValue
    private Long num;
    @Column(nullable = false)
    private String title;
    @Lob
    private String content;
    @Column(columnDefinition="integer default 0")
    private Integer answercnt;

    @CreatedDate
    private LocalDateTime createDate;
    private Long createUsernum;
    @CreatedDate
    private LocalDateTime modifyDate;
    private Long modifyUsernum;

    ///////필드끝


    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Long getCreateUsernum() {
        return createUsernum;
    }

    public void setCreateUsernum(Long createUsernum) {
        this.createUsernum = createUsernum;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyUsernum() {
        return modifyUsernum;
    }

    public void setModifyUsernum(Long modifyUsernum) {
        this.modifyUsernum = modifyUsernum;
    }

    public Integer getAnswercnt() {
        return answercnt;
    }

    public void setAnswercnt(Integer answercnt) {
        this.answercnt = answercnt;
    }

    public String getCreateDateFormat() {
        return getDateFormat(createDate,"yyyy-MM-dd HH:mm:ss");
    }
    public String getModifyDateFormat() {
        return getDateFormat(modifyDate,"yyyy-MM-dd HH:mm:ss");
    }

    private String getDateFormat(LocalDateTime dateTime,String format) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DateTimeFormatter.ofPattern(format));
    }

}
