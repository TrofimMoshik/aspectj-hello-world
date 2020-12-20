package ru.moshik.tm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class GreetingAspect {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Around("execution(* ru.moshik.tm.aspect.GreetingService.*(..))")
    public Object advice(ProceedingJoinPoint pjp) throws Throwable {
        String serviceGreeting = (String) pjp.proceed();
        return message + " and " + serviceGreeting;
    }

}
