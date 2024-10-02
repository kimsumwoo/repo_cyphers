package com.loras.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.loras.common.constants.Constants;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckLoginSessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			System.out.println(request.getSession().getAttribute("sessSeqXdm"));
		if (request.getSession().getAttribute("sessSeqXdm") != null) {
			// by pass
			System.out.println("if");
		} else {
			try {
			    response.sendRedirect(Constants.URL_LOGINFORM);
			} catch (Exception e) {
			    e.printStackTrace(); // 로그로 예외 확인
			}
//			response.sendRedirect(Constants.URL_LOGINFORM);
			System.out.println("else");
	        return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}	
}
