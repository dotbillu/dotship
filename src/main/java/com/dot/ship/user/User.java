package com.dot.ship.user;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private UUID id;
  private String name;
  private String avatarUrl;
  private String email;
  private String googleId;
  private String password;
  private LocalDateTime createdAt;

}
