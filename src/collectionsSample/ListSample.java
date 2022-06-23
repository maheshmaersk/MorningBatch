package collectionsSample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>();
        abc.add("Apple");
        abc.add("ball");
        abc.add("cat");
        abc.add("dog");
        abc.add("Apple");


        ArrayList<String> abc1 = new ArrayList<>();
        abc1.add("Apple");
        abc1.add("ball");
        abc1.add("cat");


//        boolean check = true;
//        while (check) {
//            if (abc.contains("Apple")) {
//                abc.remove("Apple");
//            } else {
//                check = false;
//            }
//        }

        abc.removeAll(abc1);

        System.out.println(abc);
//        for (String data : abc) {
//            System.out.println(data);
//        }


        ArrayList<Integer> as = new ArrayList<>();
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(4);
        as.add(5);

        System.out.println(as);

        ArrayList<Integer> as1 = new ArrayList<>();
        as1.add(1);
        as1.add(3);
        as1.add(2);
        System.out.println(as1);

        as.removeAll(as1);

        System.out.println(as);

    }
}
