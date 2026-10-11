package com.dot.ship.user;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dot.ship.common.dto.pagination.PageResponse;
import com.dot.ship.common.exception.ResourceNotFoundException;

/**
 * UserService
 */
@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public PageResponse<User> getUsers(int page, int size) {
    int safeSize = Math.min(size, 50);
    Pageable pageable = PageRequest.of(page, safeSize);
    Page<User> userPage = this.userRepository.findAll(pageable);

    return PageResponse.from(userPage);
  }

  public User getUserById(UUID id) {
    return this.userRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("No user found with Id :" + id));
  }

  public User CreateUser(User user) {
    return this.userRepository.save(user);
  }
}
