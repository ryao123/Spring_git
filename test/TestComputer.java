import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import computer.computer;
import print.Printer;

class TestComputer {

	@Test
	void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext2.xml");
		//通过getBean方法获得配置信息，保存对象
		computer p=(computer) ctx.getBean("computer");
		//调用对象的方法实现操作
		p.print();
	}

}
