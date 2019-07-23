package com.slitherine.gw.repository;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.model.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface commentRepository extends JpaRepository<comment, Integer> {

}