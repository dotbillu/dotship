package com.dot.ship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dot.ship.user.User;

@SpringBootApplication
public class ShipApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShipApplication.class, args);
    User guy = new User();
    guy.setName("abhay");
    System.out.println(guy.getName());

  }

}
