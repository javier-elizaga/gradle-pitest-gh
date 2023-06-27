package com.demo.pitest;

import static org.assertj.core.api.Assertions.assertThat;

import com.demo.pitest.SomeService;
import com.demo.pitest.SomeServiceInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeServiceTest {

  @InjectMocks
  SomeService sut;

  @Test
  void test_shouldReturnTrue() {
    var request = SomeServiceInput.builder().value(50).build();

    var actual = sut.test(request);

    assertThat(actual).isTrue();
  }

  @Test
  void test_shouldReturnFalse() {
    var request = SomeServiceInput.builder().value(-50).build();

    var actual = sut.test(request);

    assertThat(actual).isFalse();
  }

  //  @Test
  //  void test_shouldReturnTrue() {
  //    var request = Mockito.mock(SomeServiceInput.class);
  //    when(request.getValue()).thenReturn(50);
  //
  //    var actual = sut.test(request);
  //
  //    assertThat(actual).isTrue();
  //  }
  //
  //  @Test
  //  void test_shouldReturnFalse() {
  //    var request = Mockito.mock(SomeServiceInput.class);
  //    when(request.getValue()).thenReturn(-50);
  //
  //    var actual = sut.test(request);
  //
  //    assertThat(actual).isFalse();
  //  }
}
