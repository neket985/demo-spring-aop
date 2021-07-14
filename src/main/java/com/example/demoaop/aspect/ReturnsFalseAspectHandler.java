package com.example.demoaop.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReturnsFalseAspectHandler {

  @Around(value = "@annotation(ReturnsFalseAspect)")
  public Boolean invert(){
    return false;
  }
}
