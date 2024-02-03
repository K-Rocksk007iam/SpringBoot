package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AudienceUsingAroundAdvise {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	

	private void takeSeats() {
		System.out.println("Take Your Seats :around");
	}

	private void turnOffMobile() {
		System.out.println("Turn Off your Mobile :around");
	}
	
	private void clap() {
		System.out.println("clap clap clap :around");
	}
	
	private void demandForRefund() {
		System.out.println("please give me my money back :around");
	}

	private void leave() {
		System.out.println("Leaving Now :around");
	}
	
	@Around("myPointCut() ")
	public void monitorPerformance(ProceedingJoinPoint jointPoint) {
		takeSeats();
		turnOffMobile(); 
		try {
		jointPoint.proceed();
		clap();
		} catch (Throwable e) {
			
			demandForRefund();
		}
		finally {
			leave();	
		}
		
	}
}
