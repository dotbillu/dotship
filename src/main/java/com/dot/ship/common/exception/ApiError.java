package com.dot.ship.common.exception;

import java.time.OffsetDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * ApiError
 */

@Getter
@Setter
public class ApiError {

  private OffsetDateTime timestamp;
  private int status;
  private String errorCode;
  private String message;
  private String path;
  private List<FieldError> FieldErrors;

}
