package com.victorlobato.victor.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VictorConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VictorConfigServerApplication.class, args);
	}

}
