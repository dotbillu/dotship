package com.dot.ship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShipApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShipApplication.class, args);
  }

}
