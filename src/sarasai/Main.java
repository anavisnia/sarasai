package sarasai;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        operator precedance
        System.out.println(5 + 4 + "Labas");
        //                  9   + "Labas"
        //                  "9Labas"
        System.out.println("Labas" + 5 + 4);
        //                  "Labas5" + 4
        //                  "Labas54"
         */

        Map map = new HashMap();

        map.put("prop1", 10);
        map.put("prop2", 10);
        map.put("prop3", "Labas");
        map.put("prop1", 5); // ne prideda dar vienos, o perrasia

        Map kitas = new HashMap();

        System.out.println(map);


        for (Object key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println(map.get("prop3"));
        System.out.println(map.get("prop5"));

        System.out.println(map.containsKey("prop3"));
        System.out.println(map.containsKey("prop5"));

        Zmogus z1 = new Zmogus("Jonas", "Jonaitis");
        Zmogus z2 = new Zmogus("Petras", "Petraitis");
        Zmogus z3 = new Zmogus("Antanas", "Antanaitis");
        Zmogus z4 = new Zmogus("Antanas", "Antanaitis");

        kitas.put(z1, "+37069900001");
        kitas.put(z2, "+37069900002");
        kitas.put(z3, "+37069900003");
        kitas.put(z4, "+37069900004");
        System.out.println(kitas);

        for (Object key : kitas.keySet()) {
            System.out.println(key + " - " + kitas.get(key));
        }

//        System.out.println(kitas.get(z1) == kitas.get(z2));

//        Set aibe = new HashSet();
//
//
//        System.out.println(z3.equals(z4));
//        System.out.println(z3 == z4);
//
//        System.out.println(z1.hashCode());
//        System.out.println(z3.hashCode());
//        System.out.println(z4.hashCode());
//
//        aibe.add(z1);
//        aibe.add(z2);
//        aibe.add(z3);
//
//        aibe.add(z4);
//
//        System.out.println(aibe);
//
//        for (Object z : aibe) {
//            System.out.println(z);
//        }

////        MyList ml = new MyList();
////        MyLinkedList ml = new MyLinkedList();
//        List ml = new ArrayList();
////        ml.printAll();
//        System.out.println(ml.size());
//        ml.add("Labas");
////        ml.printAll();
//        System.out.println(ml.size());
//        ml.add("Pasauli");
////        ml.printAll();
//        System.out.println(ml.size());
//        ml.add("!");
////        ml.printAll();
//        System.out.println(ml.size()); // 3
//        System.out.println(ml); // [Labas, Pasauli, !]
//        System.out.println(ml.get(1)); // Pasauli
//        ml.remove(0);
//        System.out.println(ml.size()); // 2
//        System.out.println(ml); // [Pasauli, !]
//        System.out.println(ml.get(1)); // !
////        ml.insert(0, "Vel labas");
////        System.out.println(ml.size()); // 3
////        System.out.println(ml); // [Vel labas, Pasauli, !]
//        ml.set(1, "Aliau");
//        System.out.println(ml); // [Vel labas, Aliau, !]
//
//        for (Object o : ml) {
//            System.out.println(o);
//        }
    }
}
