package io.codeforall.bootcamp;

public class Book {

    private String Author;
    private String Title;

    public Book(String Author, String Title) {

       this.Author=Author;
       this.Title=Title;
    }

    public String AuthorName(){
        return Author;
    }

}
