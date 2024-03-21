package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {
	Hello hello = new Hello();
	hello.setData("hello");
	String data = hello.getData();


	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

}
