package com.loras.common.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.loras.common.interceptor.CheckLoginSessionInterceptor;
import com.loras.common.interceptor.CheckLoginSessionInterceptorUsr;

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
			registry.addInterceptor(new CheckLoginSessionInterceptorUsr())
//			.order(1)
			.addPathPatterns("/usr/v1/infra/**")
			.excludePathPatterns(
//					"/resources/**",
//					"/adt/**",
					"/usr/css/**",
					"/usr/img/**",
					"/usr/js/**",
					"/usr/vender/**",
					"/usr/v1/infra/login/**",
					"/usr/v1/infra/index/indexUsr",
					"/usr/v1/infra/productUsrgrid/**",
					"/usr/v1/infra/productUsrDetail/**",
					"/usr/v1/infra/signUp/**"
					
					

			);
		}

}

