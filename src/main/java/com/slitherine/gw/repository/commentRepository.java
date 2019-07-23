package com.slitherine.gw.repository;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.model.post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


@Repository
public interface commentRepository extends JpaRepository<comment, Integer> {

    Page<comment> findByPostId(int postId, Pageable pageable);
}