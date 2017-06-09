package com.roshnimasand.springdemo.serviceimpl;

import java.util.Random;

import com.roshnimasand.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organization " + companyName +
				" provides an outstanding Ecommerce platform." +
				"\nThe annual revenue exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
