package com.controller;


import com.comm.util.IpUtil;
import com.dao.UserMapper;
import com.pojo.R;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class LoginController {


	@Autowired
	private UserMapper userMapper;

	/**
	 * 登陆
	 * @param request  id：用户id   password：用户密码
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public R login(HttpServletRequest request, @RequestBody User user) {
		if (StringUtils.isEmpty(user.getId())||StringUtils.isEmpty(user.getPassword())){
			return  R.error("请求参数不正确");
		}
		User user1 = userMapper.selectByPrimaryKey( user.getId());
		if (!StringUtils.isEmpty(user1)) {
			if (user1.getPassword().equals(user.getPassword())){
				user.setIp(IpUtil.getLocalIp(request));
				userMapper.updateOne(user);
				return R.ok("登录成功");
			}
		}
		return  R.error("登录失败");
	}


	/**
	 * 退出登录
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping("logout")
	public R logout(HttpServletRequest request, @RequestBody User user) {
		if (StringUtils.isEmpty(user.getId())){
			return  R.error("请求参数不正确");
		}
		userMapper.updateOne(user.setIp(IpUtil.getLocalIp(request)));
		return R.ok("退出成功");
	}

	/**
	 * 更新信息
	 * @param request
	 * @param user  id：用户id
	 * @return
	 */
	@RequestMapping("update/user")
	public R updateUser(HttpServletRequest request, @RequestBody User user) {
		if (StringUtils.isEmpty(user.getId())){
			return  R.error("请求参数不正确");
		}
		userMapper.updateByPrimaryKeySelective(user);
		return R.ok("更新成功");
	}

	/**
	 * 单条信息显示
	 * @param request  id：用户id
	 * @param user
	 * @return
	 */
	@RequestMapping("get/user")
	public R getUser(HttpServletRequest request, @RequestBody User user) {
		if (StringUtils.isEmpty(user.getId())){
			return  R.error("请求参数不正确");
		}
		User user1 = userMapper.selectByPrimaryKey( user.getId());
		return R.ok().put("user",user1);
	}

}
