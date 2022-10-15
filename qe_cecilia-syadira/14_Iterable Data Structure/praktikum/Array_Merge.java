package itmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Merge {
    public static void main(String args[])
    {
        String str1[] = { "kazuya", "jin", "lee" };
        String str2[] = { "kazuya", "feng" };

        List list = new ArrayList(Arrays.asList(str1));

        list.addAll(Arrays.asList(str2));

        Object[] str3 = list.toArray();

        System.out.println(Arrays.toString(str3));
    }

}