package com.cyb.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.dubbo.intf.service.DemoService;

public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"dubbo-consumer.xml");
		context.start();

		DemoService demoService = context.getBean(DemoService.class);
		System.out.println(demoService.sayHello("World"));
	}

}
