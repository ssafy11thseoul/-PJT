package com.ssafy.spair.model.dao;

import com.ssafy.spair.model.dto.Comment;

public interface CommentDao {

	int insert(Comment comment) ;
	
	int modify(Comment comment) ;

	int delete(int commentId) ;
	
}
