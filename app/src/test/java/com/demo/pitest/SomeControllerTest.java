package com.demo.pitest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.demo.pitest.SomeController;
import com.demo.pitest.SomeControllerRequest;
import com.demo.pitest.SomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeControllerTest {

  @InjectMocks
  SomeController sut;
  @Mock
  SomeService service;

  @Test
  void test_whenServiceReturnTrue() {
    when(service.test(any())).thenReturn(true);

    var request = SomeControllerRequest.builder().value(50).build();

    var actual = sut.test(request);
    assertThat(actual).isTrue();
  }

  @Test
  void test_whenServiceReturnFalse() {
    when(service.test(any())).thenReturn(false);

    var request = SomeControllerRequest.builder().value(50).build();

    var actual = sut.test(request);
    assertThat(actual).isFalse();
  }

  //  @Test
  //  void test_whenServiceReturnTrue() {
  //    var input = SomeServiceInput.builder().value(50).build();
  //    when(service.test(eq(input))).thenReturn(true);
  //    var request = SomeControllerRequest.builder().value(50).build();
  //
  //    var actual = sut.test(request);
  //
  //    assertThat(actual).isTrue();
  //  }
  //
  //  @Test
  //  void test_whenServiceReturnFalse() {
  //    var input = SomeServiceInput.builder().value(50).build();
  //    when(service.test(eq(input))).thenReturn(false);
  //    var request = SomeControllerRequest.builder().value(50).build();
  //
  //    var actual = sut.test(request);
  //    assertThat(actual).isFalse();
  //  }
}
