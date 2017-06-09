package com.spring.springGITtest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springGITtest1.model.SpringGITtest1DAO;


//==== #30. Service 선언 ====
@Service
public class SpringGITtest1Service implements InterSpringGITtest1Service {
//	==== #31. 의존객체 주입하기 (DI : Dependency Injection) ====
	@Autowired
	private SpringGITtest1DAO dao;
}
