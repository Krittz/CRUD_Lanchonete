package com.cristian.lanchonete.api.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table( name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String year;
    private double edition;
    private String author;


    public BookEntity() {
    }

    public BookEntity(Long id, String name, String year, double edition, String author) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.edition = edition;
        this.author = author;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEdition() {
        return this.edition;
    }

    public void setEdition(double edition) {
        this.edition = edition;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}