package org.sj.msuserstatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaAuditing
//@EnableDiscoveryClient
@EnableAutoConfiguration
public class MsUserStaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserStaticApplication.class, args);
	}

}

