import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		//����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1.xml");
		//ͨ��getBean�������������Ϣ���������
		Printer p=(Printer) ctx.getBean("Printer");
		//���ö���ķ���ʵ�ֲ���
		p.print();
	}

}
