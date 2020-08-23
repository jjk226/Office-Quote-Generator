package com.james.office.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.office.dao.QuoteDAO;
import com.james.office.entity.Quote;

@Service
public class QuoteServiceImpl implements QuoteService {
	
	@Autowired
	private QuoteDAO quoteDAO;

	@Override
	@Transactional
	public List<Quote> getQuotes() {
		return quoteDAO.getQuotes();
	}

}
