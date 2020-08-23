package com.james.office.dao;

import java.util.List;

import com.james.office.entity.Quote;

public interface QuoteDAO {
	
	public String getQuote(int id);
	
	public List<Quote> getQuotes();

}
