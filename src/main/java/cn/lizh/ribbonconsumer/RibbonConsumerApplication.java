package cn.lizh.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * EnableCircuitBreaker 开启断路器
 * EnableDiscoveryClient 服务发现
 * SpringBootApplication SpringBoot
 * 以上三个可以使用 SpringCloudApplication替代
 */
@SpringCloudApplication
public class RibbonConsumerApplication {

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}

}
