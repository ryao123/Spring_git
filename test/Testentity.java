import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.TestEntity;



class Testentity {

	@Test
	void test() {
		//创建applicationContext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext5.xml");
		//通过getBean方法获得对象
		TestEntity test=(TestEntity) ctx.getBean("entity");
		//调用方法
		test.showValue();
	}

}
