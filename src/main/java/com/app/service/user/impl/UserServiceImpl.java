package com.app.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.user.UserDAO;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	
	@Override
	public int saveUser(User user) {
		// room 정보 저장해라 -> DAO
		int result = userDAO.saveUser(user);
		return result;
	}

	@Override
	public int saveAdminUser(User user) {
		//관리자 계정 추가 할 때 필요한 체크 로직...
		
		user.setUserType("ADM");
		int result = userDAO.saveUser(user);
		return result;
	}

	@Override
	public int saveCustomerUser(User user) {

		user.setUserType("CUS");
		int result = userDAO.saveUser(user);
		return result;
	}
	
	@Override
	public List<User> findUserList(){
		
		// DAO 를 활용해서, 실제 데이터 가져오기
		List<User> userList = userDAO.findUserList();
		
		return userList;
	}
}
