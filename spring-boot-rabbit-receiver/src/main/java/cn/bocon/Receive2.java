package cn.bocon;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receive2 {

	@RabbitListener(queues = "oneToManyQueue") // 监听器监听指定的Queue
	public void process1(String str) {
		System.out.println("Receive2 message:" + str);
	}

}
