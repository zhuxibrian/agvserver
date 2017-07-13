package com.zx.agvserver;

import com.zx.agvserver.connector.controller.AgvController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("com.zx.agvserver.domain")
public class WebapiApplication {

	@Bean
	public AgvController webSocketController() {
		System.out.println("调用webSocketController====》》》》");
		return new AgvController();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}
}
