import ru.biblio.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            BiblioList bibs = new BiblioList();
            BiblioList bibs1 = new BiblioList();
            BiblioList bibs2 = new BiblioList();
            Biblio b = new Book();
            Biblio b1 = new Book();
            Biblio v = new Video("Форсаж");
            Biblio m = new Magazine();
            bibs.add(b);
            bibs.add(b1);
            bibs1.add(v);
            bibs2.add(m);
            bibs.remove(0);
            System.out.println(bibs1.get(1).getName());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
