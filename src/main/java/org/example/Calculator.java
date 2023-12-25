package org.example;

import lombok.*;

@Data
@AllArgsConstructor

public class Calculator {
    private int x;
    private int y;

    public Calculator() {

    }

    public void sum() {
        System.out.println(x+y);
    }
}
