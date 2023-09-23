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
         int count = 2;
         while (count < n){
            numbers.add(count);
            count ++;
         }

         Iterator <Integer> iterator = numbers.iterator();
         count = 2;
         while(iterator.hasNext()){
            int next = iterator.next();
            for(count = 2; count < next+1; count++){
               if(next%count == 0 && next != count){
                  iterator.remove();
                  count = next;
               }
            }
         } 
         System.out.println(numbers);       
   }
}