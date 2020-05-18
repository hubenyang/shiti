package com.dao;

import com.comm.MyMapper;
import com.pojo.User;


/**
 * @author hubenyang
 * @date 16:01 2019/06/14
 */
public interface UserMapper extends MyMapper<User> {

    int updateOne(User user);


}
