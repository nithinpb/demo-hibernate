package com.test.demohibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
public class Tag extends BaseEntity {
    private String text;
}
