package com.innovasoft.PO2Academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Po2AcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Po2AcademyApplication.class, args);
	}

}
