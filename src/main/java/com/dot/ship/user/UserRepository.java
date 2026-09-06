package com.dot.ship.user;

import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  private final JdbcTemplate jdbcTemplate;

  public UserRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public User findById(UUID id) {
    String sql = """
        SELECT id,name,avatar_url,email,created_at
        FROM users
        WHERE id = ?
          """;
    return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
      User user = new User();
      user.setId(rs.getObject("id", UUID.class));
      user.setName(rs.getString("name"));
      user.setEmail(rs.getString("email"));
      user.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
      return user;
    }, id);
  }

  public User Create(User user) {
    String sql = """
        INSERT INTO user (
            name,
            avatar_url,
            email,
            password
            )
        VALUES(?,?,?,?)
        RETURNING id,name,avatar_url,email,password,created_at
        """;
    return jdbcTemplate.queryForObject(sql,
        (rs, rowNum) -> {
          User createdUser = new User();

          return createdUser;

        });
  }
}
