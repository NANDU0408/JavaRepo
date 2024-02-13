package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class DiseaseDTO implements Serializable {
    private String name;
    private String type;
    private String symptoms;
    private int severityLevel;
}
