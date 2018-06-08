package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @AllArgsConstructor @Getter @Lazy
public class ClassA {
    private ClassB b;
}
