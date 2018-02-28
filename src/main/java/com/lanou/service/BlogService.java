package com.lanou.service;

import com.lanou.bean.BlogBean;

/**
 * Created by dllo on 18/2/27.
 */
public interface BlogService {
    Integer makeNew(String title, String des, String content,Integer userId);
}
