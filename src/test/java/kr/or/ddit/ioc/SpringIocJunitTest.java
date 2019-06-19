package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.service.IBoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/ioc/application-ioc-test.xml")
public class SpringIocJunitTest {
	ApplicationContext context;
	
	@Resource(name="BoardServiceImpl")
	private IBoardService boardService;
	
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
		String result = boardService.sayHello();
		/***Then***/
		assertNotNull(boardService);
		assertNotNull(result);
		assertEquals("BoardDao Say Hello", result);
	}

}
