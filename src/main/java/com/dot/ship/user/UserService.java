package com.dot.ship.user;

import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUserById(UUID id) {
    return this.userRepository.findById(id).orElseThrow();
  }

  public User CreateUser(User user) {
    return this.userRepository.save(user);
  }
}
