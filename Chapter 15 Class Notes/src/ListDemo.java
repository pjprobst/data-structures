import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {

        // The addLast, addFirst and add methods can be used to populate a list
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Diana");
        staff.add("Harry");
        staff.add("Romeo");
        staff.add("Tom");

        // The list is currently Diana Harry Romeo Tom (DHRT)
        /*
         * The listIterator method creates a new list iterator
         * that is positioned at the head of the list
         * The "|" is used to represent the iterator position
         * 
         */
        ListIterator<String> iterator = staff.listIterator(); // DHRT

        //The next method advance the iterator to the next element in the list
        iterator.next(); //D|HRT

        //The next method returns the element that the iterator is passing by
        String name = iterator.next(); //DH|RT
        System.out.println(name);//prints harry

        iterator.add("Juliet");
        iterator.add("Nina");//DHJN|RT

        //remove - removes next from previous can only be called once after iterating can't be called after calling add

        iterator.next();//DHJNR|T
        iterator.remove();//DHJN|T

        System.out.println(staff);

        iterator.previous();//DHJ|NT
        iterator.set("Albert");

        iterator = staff.listIterator();
        while(iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Juliet")){
                iterator.remove();
            }
        }
        for (String n: staff){
            System.out.println(n + " ");
        }

        iterator = staff.listIterator();
        while(iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Harry")){
                //staff.remove("Diana")
            }    
        }
        for(String n: staff){
            if(n.equals("Harry")){
                //staff.add("Charlie")
            }
        }


        }
    }
}
