package com.cyb.dubbo.provider.service.impl;

import com.cyb.dubbo.intf.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
