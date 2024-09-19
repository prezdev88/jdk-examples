package com.jdk.examples.j8;

import com.jdk.examples.annotation.JDKExample;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JDK8Example1 {

    @JDKExample(number = 1, version = 8, description = "Lambda Expressions")
    public void example() {
        // Lista de enteros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Uso de expresiones lambda con streams para filtrar y sumar números
        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0) // Filtra números pares
                         .mapToInt(n -> n)       // Mapea a int
                         .sum();                 // Suma los números

        log.info("Suma de números pares: {}", sum);
    }

}
