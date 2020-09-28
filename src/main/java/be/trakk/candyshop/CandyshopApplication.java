package be.trakk.candyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"be.trakk.candyshop.entities"})
@SpringBootApplication
public class CandyshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandyshopApplication.class, args);
    }

}
