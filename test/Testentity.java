import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.TestEntity;



class Testentity {

	@Test
	void test() {
		//����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext5.xml");
		//ͨ��getBean������ö���
		TestEntity test=(TestEntity) ctx.getBean("entity");
		//���÷���
		test.showValue();
	}

}
