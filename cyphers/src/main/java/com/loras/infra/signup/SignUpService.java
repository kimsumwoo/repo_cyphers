package com.loras.infra.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
	@Autowired
	public SignUpDao signUpDao;
}