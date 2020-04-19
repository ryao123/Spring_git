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
		//ͨ��getBean�������������Ϣ���������
		computer p=(computer) ctx.getBean("computer");
		//���ö���ķ���ʵ�ֲ���
		p.print();
	}

}
