package collectionsSample;

import java.util.*;

public class HashExample {

    public static void main(String[] args) {
////        HashMap<Integer,String> map=new HashMap<>();//Creating HashMap
//        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();//Creating HashMap
////        HashMap<Integer,String> map=new HashMap<>();//Creating HashMap
//        map.put(1,"Mango");  //Put elements in Map
//        map.put(2,"Apple");
//        map.put(3,"Banana");
//        map.put(4,"Grapes");
//
//        System.out.println("Iterating Hashmap...");
//        for(Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }


        TreeMap<String, Integer> map1 = new TreeMap<>();

        // Adding elements to the Map
        // using standard put() method
        map1.put("Zeena", 10);
        map1.put("Deepak", 40);
        map1.put("Abhi", 30);
        map1.put("Giri", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map1.size());

        // Printing elements in object of Map
        System.out.println(map1);


//        HashSet<String> set=new HashSet();
        TreeSet<String> set=new TreeSet();
        set.add("One");
        set.add("Four");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Two");
        set.add("Five");
        System.out.println(set);

    }
}
