package dev.harsh.architect.aspect.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RazorPaymentService implements PaymentService{
    @Override
    public void makePayment() throws InterruptedException {
        System.out.println("Amount debited !!!!");
        System.out.println("Amount credited !!!!");
        Thread.sleep(1000);
    }
}
