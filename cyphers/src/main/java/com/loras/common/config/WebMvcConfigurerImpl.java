package com.loras.common.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.loras.common.interceptor.CheckLoginSessionInterceptor;

public class WebMvcConfigurerImpl implements HandlerInterceptor {
	
	 public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new CheckLoginSessionInterceptor())
//					.order(1)
					.addPathPatterns("/*/*/*/*Xdm*")
					.excludePathPatterns(
//							"/resources/**",
							"/adt/**",
							"/xdm/**",
							"/v1/infra/member/signupXdmForm",
							"/v1/infra/member/signinXdmForm",
							"/v1/infra/member/signinXdmProc"
			);
		}

}
