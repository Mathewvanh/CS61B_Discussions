import java.util.*;
public class IteratorDemo {

    public static void main(String args[]) {
        // Create an array list
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        ArrayList al3 = new ArrayList();
        ArrayList al4 = new ArrayList();
        ArrayList al5 = new ArrayList();
        // add elements to the array list
        al.add(9);
        al.add(8);
        al2.add(1);
        al2.add(2);
        al2.add(3);
        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator itr = al.iterator();
        Iterator itr2 = al2.iterator();
        Iterator itr3 = al3.iterator();
        Iterator itr4 = al4.iterator();
        Iterator itr5 = al5.iterator();
        List<Iterator<Integer>> L = new ArrayList<Iterator<Integer>>();
        L.add(itr);
        L.add(itr3);
        L.add(itr2);
        L.add(itr4);
        L.add(itr5);
        IteratorOfIterators x = new IteratorOfIterators(L);
        while(x.hasNext()) {
            Object element = x.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator litr = al.listIterator();

        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards
        System.out.print("Modified list backwards: ");

        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}