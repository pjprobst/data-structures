import java.util.*;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
         Set<Integer> numbers = new HashSet<>();
         Set<Integer> primenumbers = new HashSet<>();
         int count = 2;
         while (count < n){
            numbers.add(count);
            count ++;
         }

         count = 2;
         Iterator<Integer> iterator = numbers.iterator();
         while(iterator.hasNext()){
            int next = iterator.next();
            System.out.println("Next: " + next);
            if ((next%count != 0 || next == 2)){
                primenumbers.add(next);
            }
            count ++;
         }
         Iterator<Integer> piterator = primenumbers.iterator();
         while(piterator.hasNext()){
            System.out.println(piterator.next());
         }
        








    }
}

