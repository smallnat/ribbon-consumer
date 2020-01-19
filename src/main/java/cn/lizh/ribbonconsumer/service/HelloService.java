package cn.lizh.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lizh
 * @date 2020/1/19
 */
@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;

	private static String url = "http://EUREKA-HI/hi";

	@HystrixCommand(fallbackMethod = "helloFallback")
	public String helloConsumer() {
		return restTemplate.getForEntity(url, String.class).getBody();
	}
	
	private String helloFallback() {
		return "fall back";
	}
}
