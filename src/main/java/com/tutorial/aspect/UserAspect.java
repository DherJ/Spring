package com.tutorial.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	static final Logger LOGGER = Logger.getLogger(UserAspect.class.getName());

	@Pointcut("execution(* com.tutorial.controller.UserController.*(..))")
	public void monitorePerfPointcut() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("pointCut");
		}
	}

	@Before("execution (* com.tutorial.controller.UserController.addUser(..))")
	public void logAddUser(JoinPoint joinPoint) throws Throwable {
		final StringBuffer sb = new StringBuffer();
		final Object[] args = joinPoint.getArgs();
		sb.append(joinPoint.getSignature().toString());
		sb.append(" avec les parametres : (");
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

		sb.append(")");
		if (LOGGER.isDebugEnabled())
			LOGGER.debug(sb.toString());
		System.out.println(sb.toString());
	}

}