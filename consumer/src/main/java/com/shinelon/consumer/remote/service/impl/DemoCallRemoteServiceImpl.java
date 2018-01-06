package com.shinelon.consumer.remote.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shinelon.api.service.DemoService;
import com.shinelon.consumer.remote.service.DemoCallRemoteService;

@Service
public class DemoCallRemoteServiceImpl implements DemoCallRemoteService{
	
	private static final Logger logger = LoggerFactory.getLogger(DemoCallRemoteServiceImpl.class);
	
	@com.alibaba.dubbo.config.annotation.Reference
	private DemoService demoService;
	
	@Override
	public String sayHello(String name) {
		logger.info("sayHello");
		String ret = demoService.hello(name);
		logger.info("ret:{}",ret);
		return ret;
	}
	
}
