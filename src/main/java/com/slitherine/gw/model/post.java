package com.slitherine.gw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:26 PM.
 */
@Entity
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String text;

    public LocalDateTime createdDate;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
