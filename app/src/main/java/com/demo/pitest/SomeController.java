package com.demo.pitest;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SomeController {

  private final SomeService service;

  public Boolean test(SomeControllerRequest request) {
    var input = map(request);
    return service.test(input);
  }

  private SomeServiceInput map(SomeControllerRequest req) {
    return SomeServiceInput.builder().value(req.getValue()).build();
  }
}
