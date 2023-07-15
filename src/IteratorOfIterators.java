import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratorOfIterators implements Iterator{
    private LinkedList<Integer>L;

    public IteratorOfIterators(List<Iterator<Integer>> a){
        L = new LinkedList<>();
        while(!a.isEmpty()){
            Iterator<Integer> curr = a.remove(0);
            if(curr.hasNext()){
                L.add(curr.next());
                a.add(curr);
            }
        }
    }
    @Override
    public boolean hasNext(){
        return !L.isEmpty();
    }
    @Override
    public Integer next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        };
        return L.removeFirst();
    }
}
