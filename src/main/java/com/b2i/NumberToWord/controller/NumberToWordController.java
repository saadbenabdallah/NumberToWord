package com.b2i.NumberToWord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.b2i.NumberToWord.model.Word;
import com.b2i.NumberToWord.service.NumberToWord;


@RestController
public class NumberToWordController {
	
	@Autowired
	private NumberToWord numberToWord;
	
	@GetMapping(value = "number/{value}")
	public Word convertController(@PathVariable Long value) {
		Word word = new Word();
		word.setContent(numberToWord.convert(value));
		return word;
	}
	
	
	
	
	
}
