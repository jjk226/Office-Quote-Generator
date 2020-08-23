package com.james.office.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.james.office.entity.Quote;
import com.james.office.service.QuoteService;

@Controller
@RequestMapping("/quote")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping("/list")
	public String getQuotes(Model model) {
		
		Random random = new Random();
		List<Quote> quotes = quoteService.getQuotes();
		
		int value = random.nextInt(quotes.size());
		//String quote = quotes.get(value).toString();
		
		Quote quote = quotes.get(value);
		model.addAttribute("quote", quote);
		
		System.out.println(quote);
		
		return "office-quotes";
	}

	

}
