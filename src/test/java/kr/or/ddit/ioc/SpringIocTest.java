package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.board.service.IBoardService;

public class SpringIocTest {
	ApplicationContext context;
	
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("classpath:kr/or/ddit/ioc/application-ioc-test.xml");
	}
	
	/**
	 * Method : springIocTest
	 * 작성자 : jakeh
	 * 변경이력 : 2019-06-19 처음 생성
	 * Method 설명 : 스프링 컨테이너 생성 테스트
	 */
	@Test
	public void springIocTest() {
		/***Given***/
		
		/***When***/
		IBoardService boardService = (IBoardService) context.getBean("BoardServiceImpl");
		String result = boardService.sayHello();
		/***Then***/
		assertNotNull(boardService);
		assertNotNull(result);
		assertEquals("BoardDao Say Hello", result);
	}

}
