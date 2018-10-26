package com.example.bean;

import org.springframework.data.jpa.repository.JpaRepository;

/**  
* <p>Title: UserRepository.java</p>  
* <p>Description: DAO 数据处理类</p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Xiao Nong
* @date 2018年10月26日  
* @version 1.0  
*/  
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}
