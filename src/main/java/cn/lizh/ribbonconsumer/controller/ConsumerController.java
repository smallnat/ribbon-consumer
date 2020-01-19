package cn.lizh.ribbonconsumer.controller;

import cn.lizh.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizh
 * @date 2020/1/17
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
	@Autowired
	private HelloService helloService;

	@GetMapping("hello")
	public String helloConsumer() {
		return helloService.helloConsumer();
	}
}
