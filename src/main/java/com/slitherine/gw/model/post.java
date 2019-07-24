package com.slitherine.gw.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:26 PM.
 */
@Entity
@Table(name = "post")
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String text;

    public LocalDateTime createdDate;

    @OneToMany(mappedBy="postId")
    private Set<comment> comments;


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
