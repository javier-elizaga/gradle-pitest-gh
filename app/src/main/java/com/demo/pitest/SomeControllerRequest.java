package com.demo.pitest;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SomeControllerRequest {

  private Integer value;
  private String name;
}
