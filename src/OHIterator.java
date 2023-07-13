import java.util.Iterator;
import java.util.NoSuchElementException;

public class OHIterator implements Iterator<OHRequest> {
    OHRequest curr;
    public OHIterator(OHRequest queue){

        this.curr=queue;
    }

    public boolean isGood(String description){
        int l1 = description.length();
        return (l1>5)?true:false;
    }

    @Override
    public boolean hasNext() {
        if(curr!=null && !isGood(curr.description))curr=curr.next;
        if(curr==null)return false;
        return true;
    }

    @Override
    public OHRequest next() {
        if(!hasNext())throw new NoSuchElementException();
        OHRequest returnItem = curr;
        curr = curr.next;
        return returnItem;
    }
}
