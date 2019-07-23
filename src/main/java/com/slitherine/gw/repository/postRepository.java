package com.slitherine.gw.repository;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.model.post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:31 PM.
 */
@Repository
public interface postRepository extends JpaRepository<post, Integer> {
    Page<comment> findByPostId(int postId, Pageable pageable);

}
