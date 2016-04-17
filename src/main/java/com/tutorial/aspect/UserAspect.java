package com.tutorial.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	static final Logger LOGGER = Logger.getLogger(UserAspect.class.getName());

	@Pointcut("execution(* com.tutorial.controller.*UserController.*(..))")
	public void monitorePerfPointcut() {
		System.out.println("pointCut()");
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("pointCut");
		}
	}

	public void logUpdateUser(final ProceedingJoinPoint joinPoint) {
		final StringBuffer sb = new StringBuffer();
		final Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			if (i < args.length - 1) {
				sb.append(", ");
			}
		}
		boolean unParametreNull = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i] == null) {
				unParametreNull = true;
				break;
			}
		}
		if (unParametreNull) {
			throw new NullPointerException(
					"Le user passé en paramètre de la méthode "
							+ joinPoint.getSignature().toString()
							+ "  est null");
		}
		if (LOGGER.isDebugEnabled())
			LOGGER.debug(sb.toString());
		System.out.println(sb.toString());
	}

	@Around("execution(* com.tutorial.controller.UserController.addUser(..))")
	public String checkAddUserNotNull(final ProceedingJoinPoint pJoinPoint) {
		System.out.println("around() addUser");
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("around() addUser");
		String res = null;
		try {
			System.out.println("around() addUser --- before");
			logUpdateUser(pJoinPoint);
			res = (String) pJoinPoint.proceed();
			logUpdateUser(pJoinPoint);
			System.out.println("around() addUser --- after");
		} catch (Throwable e) {
			// LOGGER.error("erreur lors de l'ajout du User : " +
			// user.toString()
			// + " en base de données");
			LOGGER.error("erreur lors de l'ajout en base de données");
			e.printStackTrace();
		}
		return res;
	}

	@Around("execution(* com.tutorial.controller.UserController.updateUser(..))")
	public String checkUpdateUserNotNull(final ProceedingJoinPoint pJoinPoint) {
		System.out.println("around() updateUser");
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("around() updateUser");
		String res = null;
		try {
			System.out.println("around() updateUser --- before");
			logUpdateUser(pJoinPoint);
			res = (String) pJoinPoint.proceed();
			logUpdateUser(pJoinPoint);
			System.out.println("around() updateUser --- after");
		} catch (Throwable e) {
			// LOGGER.error("erreur lors de l'ajout du User : " +
			// user.toString()
			// + " en base de données");
			LOGGER.error("erreur lors de la mise à jour en base de données");
			e.printStackTrace();
		}
		return res;
	}
}