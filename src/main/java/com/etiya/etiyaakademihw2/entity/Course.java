package com.etiya.etiyaakademihw2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Course {
    private Long id;
    private String courseName;
    private String description;
    // todo enum yapilabilir
    private String category;
    // todo instructor nesnesi
    private String instructor;
}
