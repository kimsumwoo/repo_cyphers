package com.loras.common.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.loras.common.interceptor.CheckLoginSessionInterceptor;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	 
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new CheckLoginSessionInterceptor())
//					.order(1)
					.addPathPatterns("/xdm/v1/infra/**")
					.excludePathPatterns(
//							"/resources/**",
//							"/adt/**",
							"/xdm/v1/template/**",
							"/usr/css/**",
							"/usr/img/**",
							"/usr/js/**",
							"/usr/vender/**",
							"/xdm/v1/infra/login/logInXdmForm",
							"/xdm/v1/infra/login/loginXdmProc"
			);
		}

}
