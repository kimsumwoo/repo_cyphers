package com.loras.infra.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {
	@Autowired
	public LogInDao logInDao;
}