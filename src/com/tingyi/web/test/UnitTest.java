package com.tingyi.web.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tingyi.web.model.MUser;
import com.tingyi.web.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class UnitTest {
	private final static Logger LOG = Logger.getLogger(UnitTest.class); 
	
	@Resource
	private IUserService userService = null;
	
	@Test
	public void test(){
		MUser user = new MUser();
		user.setName("Albery");
		user.setAge(18);
		int result = userService.addUser(user);
		LOG.info("ÃÌº”≤‚ ‘£∫" + result);
	}
}
