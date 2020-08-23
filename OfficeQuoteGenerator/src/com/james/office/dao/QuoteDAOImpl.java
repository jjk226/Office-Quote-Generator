package com.james.office.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.james.office.entity.Quote;

@Repository
public class QuoteDAOImpl implements QuoteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public QuoteDAOImpl() {
		
	}

	@Override
	@Transactional
	public String getQuote(int id) {
		
		return null;
	}


	@Override
	public List<Quote> getQuotes() {
		Session session = sessionFactory.getCurrentSession();	
		Query<Quote> query = session.createQuery("FROM Quote", Quote.class);
		List<Quote> quotes = query.getResultList();
		
		return quotes;
	}

}
