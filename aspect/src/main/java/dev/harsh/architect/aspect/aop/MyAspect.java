package dev.harsh.architect.aspect.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* dev.harsh.architect.aspect.services.RazorPaymentService.makePayment())")
    public  void printBefore(){
        System.out.println(LocalDateTime.now());
    }

    @After("execution(* dev.harsh.architect.aspect.services.RazorPaymentService.makePayment())")
    public void printAfter(){
        System.out.println(LocalDateTime.now());
    }
}
