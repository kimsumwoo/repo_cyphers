package com.loras.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.loras.common.constants.Constants;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckLoginSessionInterceptorUsr implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			System.out.println(request.getSession().getAttribute("sessSeqUsr"));
			System.out.println(request.getSession().getAttribute("nickname"));
		if (request.getSession().getAttribute("sessSeqUsr") != null || request.getSession().getAttribute("userId") !=null) {
			// by pass
			System.out.println("if");
		} else {
			    response.sendRedirect(Constants.URL_LOGINUsrFORM);
//			response.sendRedirect(Constants.URL_LOGINFORM);
			System.out.println("else");
	        return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}	

}
