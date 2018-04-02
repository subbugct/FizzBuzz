package com.word.gen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.word.gen.servicedelegation.ServiceDelegation;

@Service
public class WordGenServiceImpl implements WordGenService {

	@Autowired
	private ServiceDelegation serviceDelegation;
	
	@Override
	public String findBizzBuzz(int input) {
		return serviceDelegation.findFizBuzz(input);
	}

}
