import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratorOfIterators implements Iterator{
    private List<Iterator<Integer>>L;
    private int index;
    private int element;
    public int size;
    public IteratorOfIterators(List<Iterator<Integer>> a){
        L=a;
        index=0;
        element=0;
        size=L.size();
    }
    @Override
    public boolean hasNext(){
        if(index<-1 || index>L.size()-1)return false;//when we reach the end
        return true;
    }
    @Override
    public Integer next(){
        if(!hasNext())throw new NoSuchElementException();
        while(!L.get(index).hasNext()){
            index++;
            if(index==size && !L.get(index).hasNext())
            if(index==size)index=0;
        }
        Integer returnItem = L.get(index).next();
        index++;
        if(index==size)index=0;
        return returnItem;
    }
}
