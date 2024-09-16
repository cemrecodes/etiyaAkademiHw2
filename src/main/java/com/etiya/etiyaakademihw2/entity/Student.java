package com.etiya.etiyaakademihw2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {
    private Long id;
    private int numberOfCompletedCourses;
}
