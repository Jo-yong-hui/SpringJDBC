package yh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yh.spring.service.BookService;
import yh.spring.service.MemberService;
import yh.spring.service.SungJukService;
import yh.spring.vo.Book;

public class BookJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("Springjdbc02.xml");

	BookService bksrv =
			(BookService) ctx.getBean("bksrv02");
		
	  
	  // bksrv.newBook();
	  // bksrv.readBook();
	  // bksrv.readOneBook();
	   
	//Book b = new Book("999","스프링 기초","더나은 출판사","30000");
	//bksrv.modifyBook(b);

	  bksrv.removeBook("100");
	 
	   
	}

}
