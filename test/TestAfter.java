import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UserService;



class TestAfter {

	@Test
	void test() {
		//创建applicationContext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext7.xml");
		//通过getBean方法获得对象
		UserService us=(UserService) ctx.getBean("userService");
		//调用对象的方法执行操作
		Teacher t=new Teacher();
		t.setId(1);
		t.setTname("张老师");
		User user=new User("张三", 20, "四川绵阳", t);
		us.save(user);
	}

}
