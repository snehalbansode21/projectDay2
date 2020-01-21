package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IClientDao;
import com.app.pojos.Address;
import com.app.pojos.Feedback;
import com.app.pojos.User;

@Service
@Transactional
public class ClientServiceImpl implements IClientService
{
	@Autowired
	private IClientDao dao;

	@Override
	public User registerClient(User u) {
		return dao.registerClient(u);
	}

	@Override
	public User updateClient(User u) {
		return dao.updateClient(u);
	}

	@Override
	public User getUserById(int userid) {
		return dao.getUserById(userid);
	}

	@Override
	public Address addAddress(Address addr) {
		return dao.addAddress(addr);
	}

	@Override
	public User returnRoleByEmail(String email) {
		return dao.returnRoleByEmail(email);
	}

	@Override
	public List<Feedback> ListUserFeedback() {
		return dao.ListUserFeedback();
	}

	@Override
	public Feedback insertFeedback(Feedback f) {
		return dao.insertFeedback(f);
	}
	
}
