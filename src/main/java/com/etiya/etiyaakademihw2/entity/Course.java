package com.etiya.etiyaakademihw2.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private Long id;
    private String courseName;
    private String description;
    private String category;
    private String instructor;
}
