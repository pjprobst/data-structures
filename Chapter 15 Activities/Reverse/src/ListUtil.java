import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iter = strings.listIterator();
        LinkedList<String> temp = new LinkedList<>();

        while (iter.hasNext()){
            iter.next();
        }
        while (iter.hasPrevious()){
            temp.add(iter.previous());
        }
        int c = 0;
        for(String n: temp){
            strings.set(c, n);
            c++;
        }

    }
}