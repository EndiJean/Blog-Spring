package com.EndiJean.service;

import java.util.List;

import com.EndiJean.model.Post;

public interface CodeblogService {
	
	List<Post> findAll();
	
	Post findById(long id);
	
	Post save(Post post);

}
