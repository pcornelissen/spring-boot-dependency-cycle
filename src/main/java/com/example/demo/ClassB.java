package com.example.demo;

import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ClassB {
    private ClassC c;

    public ClassB(@Lazy ClassC c) {
        this.c = c;
    }
}
