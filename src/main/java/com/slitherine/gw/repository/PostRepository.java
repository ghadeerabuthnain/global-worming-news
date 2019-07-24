package com.slitherine.gw.repository;

import com.slitherine.gw.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:31 PM.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
