package com.srijanalama.projects.passwordGenerator.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class LoggingAdvice {

    @Before("execution(* com.srijanalama.projects.passwordGenerator.*.*.*(..))")
    public void logMethods(JoinPoint joinPoint){
        log.info("Inside " + joinPoint.getSignature().getName() + "method of " + joinPoint.getTarget().getClass().getSimpleName() );

    }
}
