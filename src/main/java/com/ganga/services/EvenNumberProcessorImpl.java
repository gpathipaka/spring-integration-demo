package com.ganga.services;

import org.springframework.stereotype.Service;

@Service
public class EvenNumberProcessorImpl implements Processor {

	@Override
	public void process(String message) {
		System.out.println("Processing Even number message : " + message);
	}

}
