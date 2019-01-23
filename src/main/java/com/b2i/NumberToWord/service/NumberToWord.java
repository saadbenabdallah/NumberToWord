package com.b2i.NumberToWord.service;

import org.springframework.stereotype.Service;

@Service
public interface NumberToWord {
	public String convert(long number);
}
