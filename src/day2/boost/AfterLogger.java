package day2.boost;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	private Logger log=Logger.getLogger(AfterLogger.class);
	
	//定义一个最终增强的切面类方法
	//最终增强其实就是在主要业务方法执行完后在执行操作
	public void afterLog(JoinPoint jp) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法结束！");
	}
}
