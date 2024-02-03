package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class Audience {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	@Before("myPointCut()")
	public void takeSeats() {
		System.out.println("Take Your Seats");
	}
	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("Turn Off your Mobile");
	}
	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("clap clap clap");
	}
	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("please give me my money back");
	}
	@After("myPointCut()")
	public void leave() {
		System.out.println("Leaving Now");
	}
}
