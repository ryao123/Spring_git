import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//ͨ��Spring�������ļ�����һ������
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��������bean 
		SpringTest test=(SpringTest) ctx.getBean("test");
		SpringTest test1=(SpringTest) ctx.getBean("test1");
		//����ʵ�����
		/*
		 * test.print(); test1.print();
		 */
		System.out.println(test.toString());
		System.out.println(test1.toString());
	}

}
