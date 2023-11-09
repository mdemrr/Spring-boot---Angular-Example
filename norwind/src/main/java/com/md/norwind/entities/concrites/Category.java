package com.md.norwind.entities.concrites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "categories")
@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private byte[] picture;
}
