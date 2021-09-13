package ru.biblio;

public class Book extends Biblio{
    private String name;
    public Book(){}
    public Book(String m_name){
        name=m_name;
    }
    public String getName() {
        return name;
    }
}
