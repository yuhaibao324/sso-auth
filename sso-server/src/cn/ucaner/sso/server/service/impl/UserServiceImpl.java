/**
 * <html>
 * <body>
 *  <P> Copyright 1994-2018. JasonInternational.</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.sso.server.service.impl;

import org.springframework.stereotype.Service;

import cn.ucaner.sso.client.domain.User;
import cn.ucaner.sso.server.service.UserService;

/**
* @Package：cn.ucaner.sso.server.service   
* @ClassName：UserServiceImpl   
* @Description：   <p> UserServiceImpl</p>
* @Author： - Jason   
* @CreatTime：2018年3月16日 下午1:47:14   
* @Modify By：   
* @ModifyTime：  2018年3月16日
* @Modify marker：   
* @version    V1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * 查找
	 */
	@Override
	public User find(User user) {
		return null;
	}
	
}