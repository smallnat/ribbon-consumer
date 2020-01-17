package cn.lizh.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lizh
 * @date 2020/1/17
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	private static String url = "http://EUREKA-HI/hi";

	@GetMapping("hello")
	public String helloConsumer() {
		return restTemplate.getForEntity(url, String.class).getBody();
	}
}
