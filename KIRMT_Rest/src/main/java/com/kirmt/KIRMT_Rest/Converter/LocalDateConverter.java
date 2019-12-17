package com.kirmt.KIRMT_Rest.Converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        if (localDate != null) {
            return Date.valueOf(localDate);
        }
        return null;
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        if(date != null) {
            return date.toLocalDate();
        }
        return null;
    }
}
