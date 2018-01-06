package com.shinelon.consumer.remote.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shinelon.consumer.BaseTest;
import com.shinelon.consumer.remote.service.impl.DemoCallRemoteServiceImpl;

public class DemoServiceImplTest extends BaseTest {

	@Autowired
	private DemoCallRemoteServiceImpl demoService;

	@Test
	public void testSayHello() {
		demoService.sayHello("dubbo");
	}
}
