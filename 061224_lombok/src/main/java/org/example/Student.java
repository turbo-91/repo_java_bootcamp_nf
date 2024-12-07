package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@With
public class Student {
    private String id;
    private String name;
    private String address;
    BigDecimal grade;

    @With
    private String warning;

}
