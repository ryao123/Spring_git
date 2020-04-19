package day2.boost;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	private Logger log=Logger.getLogger(AfterLogger.class);
	
	//����һ��������ǿ�������෽��
	//������ǿ��ʵ��������Ҫҵ�񷽷�ִ�������ִ�в���
	public void afterLog(JoinPoint jp) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"����������");
	}
}
