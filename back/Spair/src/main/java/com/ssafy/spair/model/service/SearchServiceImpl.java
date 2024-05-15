package com.ssafy.spair.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.spair.model.dao.SearchDao;
import com.ssafy.spair.model.dto.Post;

@Service
public class SearchServiceImpl implements SearchService {
	
	private SearchDao searchDao ;
	
	@Autowired
	public SearchServiceImpl(SearchDao searchDao) {
		this.searchDao = searchDao ;
	}

	@Override
	public List<Post> searchKeyword(String keyword) {
		return searchDao.searchKeyword(keyword);
	}

}
