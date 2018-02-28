package com.lanou.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by dllo on 18/2/27.
 */
@Repository
public interface BlogMapper {
    Integer makeNew(@Param("title") String title,
                    @Param("des") String des,
                    @Param("content") String content,
                    @Param("userId") Integer userId);
}
