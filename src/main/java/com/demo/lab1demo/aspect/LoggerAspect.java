package com.demo.lab1demo.aspect;

import com.demo.lab1demo.aspect.annotations.ExecutionTime;
import com.demo.lab1demo.models.Logger;
import com.demo.lab1demo.repositories.LoggerRepo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Aspect
@Component
public class LoggerAspect {
    public double bef, aft;

    @Autowired
    LoggerRepo loggerRepo;

    @Pointcut("@annotation(com.demo.lab1demo.aspect.annotations.ExecutionTime)")
    public void executionTime(){
    }

    @Before("executionTime()")
    public void timeBefore (){
        LocalTime time = LocalTime.now();
        bef = time.getNano();
    }

    @After("executionTime()")
    public void timeAfter(){
        LocalTime time = LocalTime.now();
        aft = time.getNano();
        System.out.println((aft-bef)/1000000000 + " seconds");
    }



//    @Pointcut("execution (* com.demo.lab1demo.controllers.*.*(..))")
//    public void logMe(){
//    }

    @After("execution (* com.demo.lab1demo.controllers.*.*(..))")
    public void logger(JoinPoint joinPoint){

        Logger logger = new Logger();
        String date = "" + LocalDateTime.now();
        logger.setDate(date.substring(0, 10));
        logger.setTime(date.substring(11));
        logger.setOperation("" + joinPoint.getSignature());
        logger.setPrinciple("" + joinPoint.getKind());
        loggerRepo.save(logger);
    }
}
