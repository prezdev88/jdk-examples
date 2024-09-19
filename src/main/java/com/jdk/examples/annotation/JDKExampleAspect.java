package com.jdk.examples.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JDKExampleAspect {

    private static final Logger logger = LoggerFactory.getLogger(JDKExampleAspect.class);

    @Before("@annotation(jdkExample)")
    public void logJDKExample(JDKExample jdkExample) {
        logger.info("[{}] JDK {}: {}", jdkExample.number(), jdkExample.version(), jdkExample.description());
    }
}
