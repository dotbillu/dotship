package com.dot.ship.user;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue
  private UUID id;

  private String name;

  @Column(name = "avatar_url")
  private String avatarUrl;

  private String email;

  @Column(name = "google_id")
  private String googleId;
  private String password;

  @Column(name = "created_at")
  private OffsetDateTime createdAt;

}
