package dev.harsh.architect.aspect;

import dev.harsh.architect.aspect.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class AspectApplication implements CommandLineRunner {
    private PaymentService paymentService;
    public static void main(String[] args) {
        SpringApplication.run(AspectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        paymentService.makePayment();
    }
}
