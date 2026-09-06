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
    return userRepository.findById(id);
  }
}
