package com.example.demoaop.controller;

import com.example.demoaop.aspect.ReturnsFalseAspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @GetMapping
  @ReturnsFalseAspect
  public Boolean returnsTrue() {
    return true;
  }
}
