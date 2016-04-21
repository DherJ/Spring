package com.tutorial.aspect;

import org.apache.log4j.Logger;
<<<<<<< HEAD
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
=======
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	static final Logger LOGGER = Logger.getLogger(UserAspect.class.getName());

<<<<<<< HEAD
	@Pointcut("execution(* com.tutorial.controller.UserController.*(..))")
	public void monitorePerfPointcut() {
=======
	@Pointcut("execution(* com.tutorial.controller.*UserController.*(..))")
	public void monitorePerfPointcut() {
		System.out.println("pointCut()");
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("pointCut");
		}
	}

<<<<<<< HEAD
	@Before("execution (* com.tutorial.controller.UserController.addUser(..))")
	public void logAddUser(JoinPoint joinPoint) throws Throwable {
		final StringBuffer sb = new StringBuffer();
		final Object[] args = joinPoint.getArgs();
		sb.append(joinPoint.getSignature().toString());
		sb.append(" avec les parametres : (");
=======
	public void logUpdateUser(final ProceedingJoinPoint joinPoint) {
		final StringBuffer sb = new StringBuffer();
		final Object[] args = joinPoint.getArgs();
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
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
<<<<<<< HEAD

		sb.append(")");
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
		if (LOGGER.isDebugEnabled())
			LOGGER.debug(sb.toString());
		System.out.println(sb.toString());
	}

<<<<<<< HEAD
=======
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
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}