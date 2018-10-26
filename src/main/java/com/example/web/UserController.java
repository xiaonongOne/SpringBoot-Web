package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.bean.UserRepository;


/**  
* <p>Title: UserController.java</p>  
* <p>Description:用户Controller类 </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Xiao Nong
* @date 2018年10月26日  
* @version 1.0  
*/  
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/getUser")
	@Cacheable(value = "user-key")
	public User getUser() {
		User user = userRepository.findByUserName("aa");
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
		return user;
	}

}
