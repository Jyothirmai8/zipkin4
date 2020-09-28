package com.zipkin4.controller;


import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class ConsumerController {
	
	@Bean
	public AlwaysSampler alwaysSampler() {
		return new AlwaysSampler();
	}
		
	@RequestMapping("allEmployee")
	public String displayAllEmployee(){
		
		return "i am service comming from zipkin4";
	}

}
