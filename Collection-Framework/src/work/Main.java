package work;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Creating collection
        // type safe - same type of elements are added.
        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Samanta");
        names.add("Durgesh");
        names.add("Durgesh");
        //names.add(1234);  -- not possible as type safe
        System.out.println(names); // duplicates are allowed
        System.out.println(names.get(0)); // Indexed collection order is preserved
        System.out.println(names.get(2));


        System.out.println("-------------------------------------------------------");



        // non-type safe - different types of elements can be added.
        LinkedList list = new LinkedList();
        list.add("Sachin");
        list.add(123);
        list.add(1524.73);
        list.add(true);
        list.add(123);
        System.out.println(list); //this proved it's not type safe because it can allow multiple type of data to be stored. // it allow duplicates
        System.out.println(list.get(2)); // Indexed collection order is preserved

        System.out.println("-------------------------------------------------------");

        Vector<String> vec = new Vector<>();
        vec.add("Shubham");
        vec.add("Durgesh");
        vec.add("Shubham"); // duplicates are allowed
        System.out.println(vec);
        System.out.println(vec.get(1)); // Indexed collection order is preserved

        System.out.println("-------------------------------------------------------");
        // Remove
        vec.remove(1);
        System.out.println(vec);
        System.out.println("-------------------------------------------------------");
        vec.remove("Shubham");
        System.out.println(vec);
        System.out.println("-------------------------------------------------------");
        System.out.println(vec.contains("Shubham"));
        System.out.println("-------------------------------------------------------");
        System.out.println(vec.size());
        System.out.println("-------------------------------------------------------");
        System.out.println(vec.isEmpty());
        System.out.println("-------------------------------------------------------");
        vec.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        vec.set(0, "Ram");
        System.out.println(vec);
        System.out.println("-------------------------------------------------------");
        vec.add(0, "Shubham");
        System.out.println(vec);
        System.out.println("-------------------------------------------------------");
        List<String> list2 = new ArrayList<>(vec);
        System.out.println(list2);

        System.out.println("-------------------------------------------------------");
        //HashSet

        HashSet<Double> nms = new HashSet<>();
        nms.add(52452.43);
        nms.add(762526.43);
        nms.add(14.14);    // auto boxing.
        nms.add(14.14);  // duplicates are not allowed.
        System.out.println(nms); // index are not preserved.

        System.out.println("-------------------------------------------------------");
        // TreeSet
        TreeSet<Double> tree = new TreeSet<>(nms);
        tree.add(14.14);// duplicates are not allowed.
        System.out.println(tree); // index are not preserved but values are stored as BST
    }


}