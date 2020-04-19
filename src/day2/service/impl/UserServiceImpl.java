package day2.service.impl;

import javax.management.RuntimeErrorException;

import day2.dao.UserDao;
import day2.pojo.User;
import day2.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(User user) {
		userDao.save(user);
		//手动抛出异常
		//throw new RuntimeException("手动抛出异常");
	}

}
