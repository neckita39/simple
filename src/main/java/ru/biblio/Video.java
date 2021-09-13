package ru.biblio;

public class Video extends Biblio{
    private String name;
    public Video(){}
    public Video(String m_name){
        name=m_name;
    }
    public String getName() {
        return name;
    }
}
