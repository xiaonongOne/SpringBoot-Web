package com.example;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.filter.MyFilter;


/**  
* <p>Title: WebConfiguration.java</p>  
* <p>Description:过滤器 </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Xiao Nong
* @date 2018年10月26日  
* @version 1.0  
*/  
@Configuration
public class WebConfiguration {

	 @Bean
	 public RemoteIpFilter remoteIpFilter() {
	        return new RemoteIpFilter();
     }
	 
	 @Bean
	 public FilterRegistrationBean testFilterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter");
	        registration.setOrder(1);
	        return registration;
	  }
}
