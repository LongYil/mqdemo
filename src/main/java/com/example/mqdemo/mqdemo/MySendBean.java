package com.example.mqdemo.mqdemo;

import lombok.Data;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
//@Component
public class MySendBean {

	private final AmqpAdmin amqpAdmin;
	private final AmqpTemplate amqpTemplate;

//	@Autowired
	public MySendBean(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
		this.amqpAdmin = amqpAdmin;
		Queue queue = new Queue("hello.world.queue");
		this.amqpAdmin.declareQueue(queue);
		this.amqpTemplate = amqpTemplate;
		this.amqpTemplate.convertAndSend("你好呀！");
		System.out.println("测试发送");
	}

	public void sendInfo(){
		amqpTemplate.convertAndSend("你好呀！");
		System.out.println("测试发送");
	}
}