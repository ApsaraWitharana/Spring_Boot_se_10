package com.example.sachini.repository;

import com.example.sachini.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    //save krapu hibernet wal method access wenne
    // blog and primery key

}
