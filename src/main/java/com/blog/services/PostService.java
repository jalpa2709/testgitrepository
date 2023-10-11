package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

public interface PostService{
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	//delete
	void deletePost(Integer postId);
	//get all post
	
	List<PostDto> getAllPost();
	PostDto getPostById(Integer postId);
	//get post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	//get all post by user
	List<PostDto> getPostByUser(Integer UserId);
	//search posts
	List<PostDto> searchPost(String keyword);

}
