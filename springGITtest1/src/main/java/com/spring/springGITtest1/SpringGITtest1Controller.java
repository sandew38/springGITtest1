package com.spring.springGITtest1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springGITtest1.service.SpringGITtest1Service;

//==== #31. 컨트롤러 선언 ====

@Controller
@Component
//XML에서 bean을 만드는 대신에
//클래스명 앞에 @Component 어노테이션을 쓰면
//해당 클래스는 bean으로 자동 등록된다.
//그리고 bean의 id는 해당 클래스명이 된다. (첫 글자는 소문자)

public class SpringGITtest1Controller {
	
// ==== #33. 의존객체 주입하기 (DI : Dependency Injection) ====

	@Autowired
	private SpringGITtest1Service service; 
	
// 테스트
	@RequestMapping(value="/hello.action", method={RequestMethod.GET})
	public String hello(HttpServletRequest req) {
		req.setAttribute("name", "유원제");
		req.setAttribute("age", 25);
		req.setAttribute("addr", "경기도 수원시"); 
		
		return "test/hello.tiles";
	}
	
	
	
}
