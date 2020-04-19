package day2.boost;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {
	private Logger log=Logger.getLogger(AroundLogger.class);
	
	//定义一个最终增强的切面类方法
	//最终增强其实就是在主要业务方法执行完后在执行操作
	public Object aroundLog(ProceedingJoinPoint jp)throws Throwable {
		
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法,方法的入参："
				+ Arrays.toString(jp.getArgs()));
		
		Object result=null;
		try {
			 result=jp.proceed();//执行目标方法，并得到他的返回值
			 log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法,方法的返回值："
						+ result);
		} catch (Throwable e) {
			log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法发生异常");
			throw e;
		}finally {
			log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法执行结束");
		}
		return result;
	}
}
