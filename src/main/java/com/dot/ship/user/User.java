package com.dot.ship.user;

import com.dot.ship.common.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

  private String name;

  @Column(name = "avatar_url")
  private String avatarUrl;

  private String email;

  @Column(name = "google_id")
  private String googleId;
  private String password;

}
