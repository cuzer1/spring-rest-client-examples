package com.cuzer.springrestclientexamples.services;

import com.cuzer.springrestclientexamples.api.domain.UserData;

public interface ApiService {
	
	UserData getUsers(Integer limit);

}
