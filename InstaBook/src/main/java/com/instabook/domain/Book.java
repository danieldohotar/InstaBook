package com.instabook.domain;

import javax.persistence.*;


@Entity
@Table (name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="genre")
    private Genre genre;

    @Column(name="language")
    private String language;

    @Column(name="year")
    private int year;

    @Column(name="publisher")
    private String publisher;

    @Column(name="ISBN")
    private int ISBN;

    public Book() {

    }

    public Book(String title, String author, Genre genre, String language, int year, String publisher, int ISBN) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.language = language;
        this.year = year;
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" + "--id=" + id + ", --title='" + title + '\'' + ", --author='" + author + '\'' +
                ", --genre=" + genre + ", --language='" + language + '\'' + ", --year=" + year + ", --publisher='" + publisher + '\'' + ", --ISBN=" + ISBN + '}';
    }
}
