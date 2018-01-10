package com.krchis.bootjsp.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="kr_board")
public class Board {
    @Id
    private Long num;

    @Column(nullable = false)
    private String title;


    @Lob
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    public String getCreateDateFormat() {
        return getDateFormat(createDate,"yyyy-MM-dd HH:mm:ss");
    }


    private String getDateFormat(LocalDateTime dateTime,String format) {
        if (dateTime == null) {
            return "";
        }
        return dateTime.format(DateTimeFormatter.ofPattern(format));
    }

}
