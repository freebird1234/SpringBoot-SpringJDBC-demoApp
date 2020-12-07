package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.dao.StudentDAO;
import com.example.dto.FinalBean;
import com.example.service.WritingService;

@Configuration
@ComponentScan("com.*")
@EnableAutoConfiguration
public class DemoApplication {


	
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.containsBean("writingService"));
		WritingService myService = context.getBean(WritingService.class);
		
		 FinalBean bean=new FinalBean();
		 HashMap<String,String> map=new HashMap<>();
	    	map.put("Akshay", "Akshay");
	    	map.put("Harshit", "Pokhar");
	    	map.put("Jim", "book");
	    	
	    	bean.setClient(map);
	    	bean.setTarget("Math");
	    	
	       myService.writeToDB(bean);

		
		
	}

}
