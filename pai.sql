create table user (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    third_account_id varchar(128) NOT NULL DEFAULT '' COMMENT '第三方用户ID',
    user_name varchar(64) NOT NULL DEFAULT '' COMMENT '用户名',
    password varchar(128) NOT NULL DEFAULT '' COMMENT '密码',
    login_type tinyint(4) NOT NULL DEFAULT '0' COMMENT '登录方式： 0-微信登录，1-账号密码登录',
    deleted tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '最后更新时间',
    Primary Key (id),
    KEY 'key_third_account_id' (third_account_id),
    KEY 'key_user_name' (user_name)
) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户登录表';