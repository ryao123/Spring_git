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
		//����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext7.xml");
		//ͨ��getBean������ö���
		UserService us=(UserService) ctx.getBean("userService");
		//���ö���ķ���ִ�в���
		Teacher t=new Teacher();
		t.setId(1);
		t.setTname("����ʦ");
		User user=new User("����", 20, "�Ĵ�����", t);
		us.save(user);
	}

}
