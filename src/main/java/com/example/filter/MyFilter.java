package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**  
* <p>Title: MyFilter.java</p>  
* <p>Description: 自定义过滤器</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Xiao Nong
* @date 2018年10月26日  
* @version 1.0  
*/  
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse sresponse, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest srequest = (HttpServletRequest) request;
		System.out.println("this is MyFilter,url :"+srequest.getRequestURI());
		filterChain.doFilter(srequest, sresponse);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
