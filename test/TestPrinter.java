import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		//创建applicationContext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1.xml");
		//通过getBean方法获得配置信息，保存对象
		Printer p=(Printer) ctx.getBean("Printer");
		//调用对象的方法实现操作
		p.print();
	}

}
