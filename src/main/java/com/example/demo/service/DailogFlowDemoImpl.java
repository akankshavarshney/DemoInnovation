package com.example.demo.service;

import java.util.List;
import com.example.demo.DailogFlowAIColl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DailogFlowAIColl;


@Repository
public class DailogFlowDemoImpl implements DailogFlowDemoDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	public String getUserByQueryTextAndAction(String queryText, String action) {
		Query query = new Query();
		query.addCriteria(Criteria.where("queryText").is(queryText));
		query.addCriteria(Criteria.where("action").is(action));
		DailogFlowAIColl coll = mongoTemplate.findOne(query, DailogFlowAIColl.class);
		
		return coll.getResponse();
	}
//	@Override
//	public List<User> getAllUsers() {
//		return mongoTemplate.findAll(User.class);
//	}
//
//	@Override
//	public User getUserById(String userId) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("userId").is(userId));
//		return mongoTemplate.findOne(query, User.class);
//	}
//
//	@Override
//	public User addNewUser(User user) {
//		mongoTemplate.save(user);
//		// Now, user object will contain the ID as well
//		return user;
//	}
//
//	@Override
//	public Object getAllUserSettings(String userId) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("userId").is(userId));
//		User user = mongoTemplate.findOne(query, User.class);
//		return user != null ? user.getUserSettings() : "User not found.";
//	}
//
//	@Override
//	public String getUserSetting(String userId, String key) {
//		Query query = new Query();
//		query.fields().include("userSettings");
//		query.addCriteria(Criteria.where("userId").is(userId).andOperator(Criteria.where("userSettings." + key).exists(true)));
//		User user = mongoTemplate.findOne(query, User.class);
//		return user != null ? user.getUserSettings().get(key) : "Not found.";
//	}
//
//	@Override
//	public String addUserSetting(String userId, String key, String value) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("userId").is(userId));
//		User user = mongoTemplate.findOne(query, User.class);
//		if (user != null) {
//			user.getUserSettings().put(key, value);
//			mongoTemplate.save(user);
//			return "Key added.";
//		} else {
//			return "User not found.";
//		}
//	}
//
//	@Override
//	public com.example.demo.service.User getUserById(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public com.example.demo.service.User addNewUser(com.example.demo.service.User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
