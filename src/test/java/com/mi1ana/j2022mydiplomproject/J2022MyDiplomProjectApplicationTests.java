package com.mi1ana.j2022mydiplomproject;

import com.mi1ana.j2022mydiplomproject.dto.Customer;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.dto.UserDto;
import com.mi1ana.j2022mydiplomproject.mappers.CustomerMapper;
import com.mi1ana.j2022mydiplomproject.mappers.UserMapper;
import com.mi1ana.j2022mydiplomproject.model.UserEntity;
import com.mi1ana.j2022mydiplomproject.repo.UserRepo;
import com.mi1ana.j2022mydiplomproject.service.TopicService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class J2022MyDiplomProjectApplicationTests {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserMapper userMapper ;

	@Autowired
	private CustomerMapper customerMapper;

	@Autowired
	private TopicService topicService;

	@Test
	void contextLoads() {
	}

	@Test
	public void UserRepo_HappyPathTest()
	{
		UserEntity user = userRepo.findById(1L).orElseThrow();
		UserDto securityUser = userMapper.map(user);
		Customer customer = customerMapper.map(user);
		Assertions.assertEquals(securityUser.getRoles(), customer.getRoles());

	}

	@Test
	public void TopicService_HappyPathTest(){
		List<Topic> topicList = topicService.loadAllTopics();
		Assertions.assertNotNull(topicList);
		Assertions.assertEquals(topicList.get(0).getId(), 1L);
	}

}
