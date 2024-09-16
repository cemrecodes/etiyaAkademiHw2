package com.etiya.etiyaakademihw2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor extends User {
    private Long id;
    private String about;
    private int numberOfCourses;
}
