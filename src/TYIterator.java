import java.util.Iterator;
import java.util.NoSuchElementException;

public class TYIterator extends OHIterator {
    OHRequest curr;
    public TYIterator(OHRequest queue) {
        this.curr=queue;
    }

    @Override
    public boolean hasNext() {
        if(curr.description.contains("thank u"))curr=curr.next.next;
        if(curr!=null && isGood(curr.description))curr=curr.next;
        if(curr==null)return false;
        return true;
    }

}
