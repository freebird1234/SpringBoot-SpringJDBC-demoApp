/*
 * package com.example.demo;
 * 
 * import java.util.HashMap;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.example.dto.FinalBean; import com.example.service.WritingService;
 * 
 * @Component public class CommandLineAppStartupRunner implements
 * CommandLineRunner {
 * 
 * @Autowired private WritingService myService;
 * 
 * @Autowired private FinalBean bean;
 * 
 * @Override public void run(String...args) throws Exception {
 * 
 * HashMap<String,String> map=new HashMap<>(); map.put("Akshay", "Akshay");
 * 
 * bean.setClient(map); bean.setTarget("Math");
 * 
 * myService.writeToDB(bean);
 * 
 * }
 * 
 * 
 * }
 */