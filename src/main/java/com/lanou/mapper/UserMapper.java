package com.lanou.mapper;

import com.lanou.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
@Repository
public interface UserMapper {
    UserBean findUser(@Param("name") String name,@Param("password") String password);
    Integer insertUser(@Param("name") String name,@Param("password") String password);
    List<UserBean> getall();
}
