package com.roy.server.seckill.serviceimpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.roy.publics.seckill.bean.SecKill;
import com.roy.publics.seckill.service.SecKillService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-service.xml", "classpath:spring-mybatis.xml" })
public class SecKillServiceImplTest {
	
    @Autowired
    private SecKillService secKillService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
    public void testGetById() throws Exception {
    	long id = 1004;
        SecKill secKill = secKillService.getById(id);
        System.out.println(secKill.getName());
    }

}
