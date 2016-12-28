package com.ganga.services;

import org.springframework.stereotype.Service;

@Service
public class OddNumberProcessorImpl implements Processor {

	@Override
	public void process(String message) {
		System.out.println("Processing Odd number message : " + message);
	}

}
