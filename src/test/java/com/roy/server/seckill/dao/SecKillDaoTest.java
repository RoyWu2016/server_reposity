package com.roy.server.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.roy.publics.seckill.bean.SecKill;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-service.xml", "classpath:spring-mybatis.xml" })
public class SecKillDaoTest extends TestCase {
	
	@Autowired
    private SecKillDao secKillDao;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
    @Test
    public void testQueryById() throws Exception {
        long id = 1004;
        SecKill secKill = secKillDao.queryById(id);
        System.out.println(secKill.getName());
    }

}
