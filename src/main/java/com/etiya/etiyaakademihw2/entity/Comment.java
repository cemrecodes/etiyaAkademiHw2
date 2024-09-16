package com.etiya.etiyaakademihw2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Comment {
    private Long id;
    private Long userId;
    private String commentText;

}
