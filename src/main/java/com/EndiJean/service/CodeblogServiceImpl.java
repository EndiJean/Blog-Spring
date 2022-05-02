package com.EndiJean.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EndiJean.model.Post;

import com.EndiJean.repository.CodeblodRepository;

@Service
public class CodeblogServiceImpl implements CodeblogService{

	@Autowired
	CodeblodRepository codeblogRepository;
	
	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
