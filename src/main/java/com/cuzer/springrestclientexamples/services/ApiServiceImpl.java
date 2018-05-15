package com.cuzer.springrestclientexamples.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cuzer.springrestclientexamples.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public UserData getUsers(Integer limit) {
		
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);		
		
		return userData;
	}

}
