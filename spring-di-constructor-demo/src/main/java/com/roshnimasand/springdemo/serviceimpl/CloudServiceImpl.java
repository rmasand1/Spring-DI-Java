package com.roshnimasand.springdemo.serviceimpl;

import java.util.Random;

import com.roshnimasand.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
			Random random = new Random();
			String service = "\nAs an organization " + companyName + 
					" offers world class Cloud Computing infrastructure." + 
					"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars";
			return service;
	}

}
