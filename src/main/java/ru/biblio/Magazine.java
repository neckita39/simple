package ru.biblio;

public class Magazine extends Biblio{
    private String name;
    public Magazine(){}
    public Magazine(String m_name){
        name=m_name;
    }
    public String getName() {
        return name;
    }
}
