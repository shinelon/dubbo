package com.shinelon.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shinelon.consumer.remote.service.DemoCallRemoteService;


@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private DemoCallRemoteService demoCallRemoteService;

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		logger.info("consumer is startup");
		return "consumer is startup";
	}

	@RequestMapping("/testDubbo")
	@ResponseBody
	public String testDubbo() {
		String ret = demoCallRemoteService.sayHello("dubbo");
		return ret;
	}
}
