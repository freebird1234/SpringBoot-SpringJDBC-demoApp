package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.dto.FinalBean;


@Component
public class WritingService {
	
	@Autowired
	StudentDAO studentDAO;

	public WritingService() {
		System.out.println("Hello");
		
	}
	public void writeToDB(FinalBean bean){
		
		studentDAO.saveFinalBean(bean);
		System.out.println("Done !!");
	}
	
}
