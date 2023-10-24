/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList students = new LinkedList();
        students.addFirst("Preston");
        students.addFirst("William");
        students.addFirst("Connor");
        students.addFirst("Mitch");

        System.out.println(students);
    }
}
