package com.shinelon.provider.export.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shinelon.api.service.DemoService;

@Service(timeout = 1000)
public class DemoServiceImpl implements DemoService {

	@Override
	public String hello(String name) {
		return "hello "+name;
	}

}
