package com.test.demohibernate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor
@Entity
public class PostComment extends BaseEntity {
    private String user;
    private String text;

    @ManyToOne(targetEntity = Post.class)
    private Post post;
}
