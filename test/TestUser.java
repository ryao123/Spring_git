import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UserService;



class TestUser {

	@Test
	void test() {
		//����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext4.xml");
		/*
		 * User user=(User) ctx.getBean("user"); System.out.println(user.toString());
		 * System.out.println("==============================");
		 * 
		 * User user1=(User) ctx.getBean("user1"); System.out.println(user1.toString());
		 */
		UserService us=(UserService) ctx.getBean("userService");
		Teacher t=new Teacher();
		t.setId(1);
		t.setTname("����ʦ");
		User user=new User("����", 20, "�Ĵ�����", t);
		us.save(user);
	}

}
