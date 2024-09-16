package com.etiya.etiyaakademihw2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserProgress {
    private Long id;
    private Long studentId;
    private Long courseId;
    private Long completionRate;
    private Boolean finished;

}
