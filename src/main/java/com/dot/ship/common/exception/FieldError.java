package com.dot.ship.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * FieldError
 */
@Getter
@Setter
public class FieldError {

  private String field;
  private String message;
}
