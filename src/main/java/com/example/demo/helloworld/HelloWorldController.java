package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/beanobject")
	public BeanObject getBeanObject() {
		return new BeanObject("Hello World");
	}
	
	@GetMapping("beanobject/{name}")
	public BeanObject getBeanObjectPath(@PathVariable String name) {
		return new BeanObject(String.format("Hello World Java, %s", name));
	}
}
