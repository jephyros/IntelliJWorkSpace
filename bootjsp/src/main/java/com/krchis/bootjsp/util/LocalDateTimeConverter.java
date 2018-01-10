package com.krchis.bootjsp.util;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
//mysql용 jpa 에서 자바와 날짜함수 바꾸는 함수  db가 달라지면 여기도 바궈야될듯
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate locDate) {
        return (locDate == null ? null : Date.valueOf(locDate));
    }

    @Override
    public LocalDate convertToEntityAttribute(Date sqlDate) {
        return (sqlDate == null ? null : sqlDate.toLocalDate());
    }


}