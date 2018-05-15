package com.cuzer.springrestclientexamples.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cuzer.springrestclientexamples.api.domain.UserData;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
	
	@Autowired
	ApiService apiService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUsers() {
		UserData userData = apiService.getUsers(3);
		assertEquals(4, userData.getData().size());
		
	}

}
