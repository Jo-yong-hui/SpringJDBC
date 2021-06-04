package yh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yh.spring.service.SungJukService;

public class HelloSpringJDBCApp02 {

	//myBatis를 이용한 프로젝트
	
	// 이 순서 반드시 익혀둘것
	// main -> service -> DAO
	// 			   (SungJuk)
	
	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("Springjdbc02.xml");

	SungJukService sjsrv =
			(SungJukService) ctx.getBean("sjsrv02");
		
	// 성적 데이터 생성후 디비에 저장
	//sjsrv.newSungJuk();
	
	// 성적 데이터 조회
	// sjsrv.readAllSungJuk();
	 
	// 성적 데이터 상세 조회
	//출력시 나오는 숫자들은 열하나하나 0부터 샌것
	//sjsrv.readOneSungJuk(8);
	 
	 
	// 성적 데이터 수정
	//sjsrv.modifySungJuk();
	 
	// 성적 데이터 삭제
	sjsrv.removeSungJuk();
	  
	  }
    }
