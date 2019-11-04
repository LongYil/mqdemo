package com.example.mqdemo.mqdemo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MyReceiveBean {

//	@RabbitListener(queues = "someQueue")
	public void processMessage(String content) {
		// ...

		System.out.println("接收消息" + content);
	}

}