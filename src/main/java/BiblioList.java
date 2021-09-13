import ru.biblio.*;

import java.util.ArrayList;
import java.util.List;

public class BiblioList {
    BiblioList(){}
    public void add(Biblio b){
        bibs.add(b);
    }
    public void remove(int i) throws Exception{
        if (!bibs.isEmpty())
            bibs.remove(i);
        else throw new Exception("Список пуст");
    }
    public Biblio get(int i)throws Exception{
        if (i>=0 && i<bibs.size())
            return bibs.get(i);
        else throw new Exception("Неверный индекс");
    }
    private List<Biblio> bibs=new ArrayList<>();
}
