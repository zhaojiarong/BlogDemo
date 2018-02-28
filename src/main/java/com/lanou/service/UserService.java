package com.lanou.service;

import com.lanou.bean.UserBean;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
public interface UserService {
    List<UserBean> getall();
    UserBean findUser(String name,String password);
    Integer insertUser(String name,String password);
}
