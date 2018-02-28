package com.lanou.service.impl;

import com.lanou.bean.BlogBean;
import com.lanou.mapper.BlogMapper;
import com.lanou.service.BlogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/27.
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;
    @Override
    public Integer makeNew(String title, String des, String content,Integer userId) {
        return blogMapper.makeNew(title,des,content,userId);
    }
}
