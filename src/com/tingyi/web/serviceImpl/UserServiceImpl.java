package com.tingyi.web.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tingyi.web.dao.IUserDao;
import com.tingyi.web.model.MUser;
import com.tingyi.web.service.IUserService;

@Service("userSerivce")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	@Override
	public int addUser(MUser user) {
		return this.userDao.insert(user);
	}

}
