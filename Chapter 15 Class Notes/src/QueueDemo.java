import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> jobs = new LinkedList<>(null);

        jobs.add("HW 1");
        jobs.add("BIG TEST 1");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("HW 2");
        jobs.add("TEST 1");
        jobs.add("WS 1");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("FINAL EXAM");
    }
}
