package com.example.student.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	
	public boolean validUser(String name,String password)
	{
	return name.equalsIgnoreCase("veera")&& password.equalsIgnoreCase("babu");

}
}
