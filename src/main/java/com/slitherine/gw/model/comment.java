package com.slitherine.gw.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String text;

    public LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name="postId", nullable=false)
    public post postId;

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
