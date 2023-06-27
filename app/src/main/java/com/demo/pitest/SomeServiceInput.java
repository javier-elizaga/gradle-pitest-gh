package com.demo.pitest;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class SomeServiceInput {

  private Integer value;
}
