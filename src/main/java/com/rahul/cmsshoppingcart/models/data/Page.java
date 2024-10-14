package com.rahul.cmsshoppingcart.models.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "pages")
@Data
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, message = "Title must be atleast 2 characters long")
    private String title;

    private String slug;

    @Size(min = 5, message = "Content must be atleast 5 characters long")
    private String content;

    private int sorting;

}
