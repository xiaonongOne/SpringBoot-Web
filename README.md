# SpringBoot-Web
简单搭建SpringBoot-Web案例

# 用户表表结构，用demo时需要创建用户表



CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `pass_word` varchar(255) NOT NULL COMMENT '密码',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `reg_time` varchar(255) CHARACTER SET latin1 NOT NULL COMMENT '注册时间',
  `user_name` varchar(255) NOT NULL COMMENT '用户名称',
  `email` varchar(255) NOT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_lqjrcobrh9jc8wpcar64q1bfh` (`user_name`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`),
  UNIQUE KEY `UK_d2ia11oqhsynodbsi46m80vfc` (`nick_name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';
