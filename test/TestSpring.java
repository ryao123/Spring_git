import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//通过Spring的配置文件创建一个对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过对象获得bean 
		SpringTest test=(SpringTest) ctx.getBean("test");
		SpringTest test1=(SpringTest) ctx.getBean("test1");
		//调用实现输出
		/*
		 * test.print(); test1.print();
		 */
		System.out.println(test.toString());
		System.out.println(test1.toString());
	}

}
