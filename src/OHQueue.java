import java.util.Iterator;
public class OHQueue implements Iterable<OHRequest>{
    OHRequest curr;
    public OHQueue(OHRequest queue){
        curr=queue;
    }

    @Override
    public Iterator<OHRequest> iterator() {
        return new OHIterator(curr);
    }
}
