package work;

import java.util.*;

public class IteratorOfCollect {
    public static void main(String[] args) {

        // Array list is a part of lite we have 3 ways types of iterating a list
            ArrayList<String> names = new ArrayList<>();
            names.add("Shubhams");
            names.add("Samantass");
            names.add("Durgesh");
            names.add("Raj");
            System.out.println(names);
        System.out.println("-------------------------------------------------------");
            // Using For each method
            names.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        // Using For each
             for(String i:names){
                 System.out.println("The length of String " +i+ " is:- "+i.length());
                 StringBuffer a = new StringBuffer(i);
                 System.out.println(a.reverse());
        }

        System.out.println("-------------------------------------------------------");

             // Using Iterator :: forward traversing .
       Iterator<String> itr =  names.iterator();
       while (itr.hasNext()){
           String nxt = itr.next();
           System.out.println(nxt);
       }
        System.out.println("-------------------------------------------------------");
       // List iterator :: backward traversing

        ListIterator<String> lisItr = names.listIterator(names.size());
       while (lisItr.hasPrevious()) {
           String back = lisItr.previous();
           System.out.println(back);
       }
        System.out.println("-------------------------------------------------------");

       //Enumerator
        Stack<Integer> int1 = new Stack<>();
        int1.add(1);
        int1.add(4);
        int1.add(7);
        int1.add(9);

        System.out.println(int1);
        System.out.println("-------------------------------------------------------");

        Enumeration<Integer> enu = int1.elements();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }

        System.out.println("-------------------------------------------------------");

        TreeSet<Integer> tr1 = new TreeSet<>(Comparator.reverseOrder());
        tr1.add(1);
        tr1.add(2);
        tr1.forEach(e -> System.out.println(e));

        System.out.println("-------------------------------------------------------");

        TreeSet<Integer> tr2 = new TreeSet<>((a,b) -> b-a);
        tr2.add(1);
        tr2.add(2);
        tr2.forEach(e -> System.out.println(e));

        System.out.println("-------------------------------------------------------");

        TreeSet<Integer> trs2 = new TreeSet<>((a,b) -> a-b);
        trs2.add(1);
        trs2.add(2);
        trs2.forEach(e -> System.out.println(e));

        System.out.println("-------------------------------------------------------");

        HashMap<String, Integer> maper = new HashMap<>();
        maper.put("Maths", 8267);
        maper.put("History", 8245);
        maper.put("History", 8245);  // key and value same - not allowed duplicate
        maper.put("Science", 6766);
        maper.put("Science", 6767);  // key same but value different  - use the last value.
        maper.put("English", 4367);
        maper.put("JIRA", 4367);   // key different but value same - create a new entry with new key
        System.out.println(maper);

        System.out.println("-------------------------------------------------------");

        maper.forEach((a,b) -> System.out.println(a +" => "+ b));

        System.out.println("-------------------------------------------------------");

        System.out.println(maper.get("English"));

        System.out.println("-------------------------------------------------------");

        System.out.println(maper.keySet());

        System.out.println("-------------------------------------------------------");

        System.out.println(maper.entrySet());

        System.out.println("-------------------------------------------------------");

        System.out.println(maper.values());





    }
}
