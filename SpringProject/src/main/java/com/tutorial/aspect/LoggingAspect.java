package com.tutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.tutorial.controller.UserController.addUser(..))")
	public void logBefore(JoinPoint joinPoint){
		System.out.println("logBefore() is running!");
		System.out.println("*******");
	}

	@After("execution(* com.tutorial.controller.UserController.addUser(..))")
	public void logAfter(JoinPoint joinPoint){
		System.out.println("logBefore() is done!");
		System.out.println("*******");
	}
}
