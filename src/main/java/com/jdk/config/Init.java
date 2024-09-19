package com.jdk.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import com.jdk.examples.j8.JDK8Example1;

@Component
@AllArgsConstructor
public class Init {

    private final JDK8Example1 jdk8Example1;

    @PostConstruct
    public void init() {
        jdk8Example1.example();
    }
}
