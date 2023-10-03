import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String,Color> favColors = new HashMap<> ();

        favColors.put("hyder", Color.RED);
        favColors.put("athena", Color.MAGENTA);
        favColors.put("bavya", Color.BLUE);

        favColors.put("mitch", Color.RED);

        favColors.put("athena", Color.ORANGE);

        System.out.println(favColors.get("athena"));

        Set<String> keys = favColors.keySet();
        for (String key: keys){
            System.out.println(key + "( " + key.hashCode()+ "): " + favColors.get(key));
        }
    }
}
