package com.sitespring.blog.repositoryModels;

import com.sitespring.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
