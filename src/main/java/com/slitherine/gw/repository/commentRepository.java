package com.slitherine.gw.repository;

import com.slitherine.gw.model.comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;


@Repository
public interface commentRepository extends JpaRepository<comment, Integer> {

    public Page<comment> findByPostId(int postId, Pageable pageable);
//    List<comment> findByPostId(int postId);
}