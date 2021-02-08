import org.w3c.dom.Node;

import java.util.*;

public class Application {
    public static void main(String[] args) {
       testList();
       testSet();
    }

    private static void testSet() {
        TreeSet<Integer> integerHashSet = new TreeSet<>();
        integerHashSet.add(3);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(1);

        System.out.println(integerHashSet);
    }

    public static void testList() {
        ArrayList<String> integerList = new ArrayList<>();
        integerList.add("basdf");
        integerList.add("cas");
        integerList.add("ab");
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}

