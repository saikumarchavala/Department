package com.Infosys.in.Sample.of.Messaging.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infosys.in.Sample.of.Messaging.Entity.User;
import com.Infosys.in.Sample.of.Messaging.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setUserName(user.getUserName());
		user.setUserId(user.getUserId());
		user.setUserAddress(user.getUserAddress());
		user.setUserCode(user.getUserCode());
		return userRepository.save(user);
	}

}
