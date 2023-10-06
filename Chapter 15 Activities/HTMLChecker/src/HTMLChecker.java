import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample1.html";
        Stack<String> braces = new Stack<>();
        String current;

        try (Scanner in = new Scanner(new File(filename)))
        {
            braces.push(in.next());
            while (in.hasNext())
            {
                String next = in.next();
                current = braces.pop();

                if (next.contains("/") && next.charAt(2) != (current.charAt(1)) || !next.contains("/"))
                {
                        braces.push(current);
                        braces.push(next);
                }
                
            }
            System.out.println(braces);

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}