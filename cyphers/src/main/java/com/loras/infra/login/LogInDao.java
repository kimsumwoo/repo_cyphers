package com.loras.infra.login;

import org.springframework.stereotype.Repository;

@Repository
public interface LogInDao {

	public LogInDto logInSelectOne(LogInDto logInDto);
}
