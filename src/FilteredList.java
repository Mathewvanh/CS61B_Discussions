import java.util.*;
public class FilteredList<T> implements Iterable<T> {
    private Predicate<T> filter;
    private List<T> L;
    public FilteredList(List<T>L,Predicate<T> filter){
        this.L=L;
        this.filter=filter;
    }
    private class FilteredListIterator<T> implements Iterator<T>{
        private List<T> list;
        private Predicate<T> pred;
        private int index;
        public FilteredListIterator(List<T>L,Predicate<T> filter){
            list=L;
            pred=filter;
            index=0;
        }
        public boolean hasNext(){
            while(list.get(index)!=null && !pred.test(list.get(index)))index++;
            if(list.get(index) ==null)return false;
            return true;
        }
        public T next(){
            if(!hasNext())throw new NoSuchElementException();
            T returnItem=list.get(index);
            index++;
            return returnItem;
        }
    }
    @Override
    public Iterator<T> iterator(){
        return new FilteredListIterator(L,filter);
    }
}
