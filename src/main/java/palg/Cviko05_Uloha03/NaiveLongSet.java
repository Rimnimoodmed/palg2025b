package palg.Cviko05_Uloha03;

import java.util.ArrayList;
import java.util.List;

public class NaiveLongSet implements LongSet {
    List<Long> list = new ArrayList<>();
    public void add(long value){
        if (!list.contains(value)) {
            list.add(value);
        }
    }
    public void remove(long value){
        list.remove(value);
    }
    public boolean contains(long value){
        return list.contains(value);
    }
}
