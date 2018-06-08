package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor @Getter
public class ClassB {
    private ClassC c;
}
