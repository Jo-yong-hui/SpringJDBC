package yh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yh.spring.service.MemberService;
import yh.spring.service.SungJukService;

public class MemberJdbcApp01 {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("Springjdbc01.xml");

	MemberService msrv =
			(MemberService) ctx.getBean("msrv");
		
	  // 회원등록
	  // msrv.newMember();
	
	  // 회원 전체 조회
	  //msrv.readAllMember();
	 
	  // 회원상세 조회(디비버 테이블에 존재하는 숫자를 넣을것!!)
	  //msrv.readOneMember(3);
	  
	  // 회원 정보 수정
	  //msrv.modifyMember();
	 
	  // 회원 정보 삭제
	   msrv.removeMember();
	 
	   
	}

}
