import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    // Stack representing the cars in the driveway.
    private Stack<Integer> driveway;

    // Stack representing the cars in the street.
    private Stack<Integer> street;

    /**
      * Constructor.
      */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();
    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
      */
    public void add(int licensePlate)
    {
        // Complete this method
        driveway.push(licensePlate);
    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
      */
    public void remove(int licensePlate)
    {
        // Push every car up to and including the needed car onto the street
        while (driveway.contains(licensePlate))
          street.push(driveway.pop());
        
        // Remove the car 
        street.pop();
        
        // Push the cars on the street back onto the driveway
        while (street.size() > 0)
          driveway.push(street.pop());

    }

    /**
      * Prints the driveway and street details to the screen.
      */
    public void print()
    {
        System.out.print("In Driveway, starting at first in (one license plate per line): ");
        // Print the cars in the driveway here
        for (Integer i : driveway)
          System.out.print(i + " ");

        System.out.println();

        System.out.print("In Street, starting at first in (one license plate per line): ");
        // Print the cars in the street here
        for (Integer i : street)
          System.out.print(i + ", ");

    }
}