package com.example.mylibraryapp;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pages;
    private String imgurl;
    private String shortDesc;
    private String longDesc;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String link;

    private boolean isexpanded;



    public boolean isIsexpanded() {
        return isexpanded;
    }

    public void setIsexpanded(boolean isexpanded) {
        this.isexpanded = isexpanded;
    }

    public Book(int id, String name, String author, int pages, String imgurl, String shortDesc, String longDesc, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.imgurl = imgurl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.link = link;
        isexpanded = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", imgurl='" + imgurl + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                "link='" + link + '\'' +
                '}';
    }
}

