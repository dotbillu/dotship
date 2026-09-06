package com.dot.ship.user;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
public class User {
  private UUID id;
  private String name;
  private String avatarUrl;
  private String email;

  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)
  private String googleId;
  @Getter(AccessLevel.NONE)
  @Setter(AccessLevel.NONE)

  private String password;
  private LocalDateTime createdAt;

}
