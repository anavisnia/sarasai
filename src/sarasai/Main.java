package sarasai;

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

        MyLinkedList ml = new MyLinkedList();
        ml.printAll();
        System.out.println(ml.size());

        ml.add("Apple");
        ml.add("Huawei");
        ml.add("Samsung");
        ml.printAll();
        System.out.println("size: " + ml.size());
        System.out.println("get indexed element: " + ml.get(1));
//        ml.remove(0);
//        ml.printAll();
//        ml.set(0, "LG");
//        ml.printAll();
//        ml.insert(2, "Nokia");
//        ml.printAll();
//        System.out.println("----");
//        System.out.println(ml.get(2));
//        System.out.println(ml);

        System.out.println("---------------");
//        try {
//            System.out.println(ml.get(-1));
//        }
//        catch (IllegalArgumentException iae) {
//            System.out.println("Ivyko klaida: " + iae);
//        }

//        System.out.println("---------------");
//        try {
//            ml.set(-2, "p");
//        }
//        catch (IllegalArgumentException iae) {
//            System.out.println("ivyko klaida: " + iae);
//        }

        /*
        System.out.println(ml.size()); // 3
        System.out.println(ml); // turi isvardinyi objektus is eiles [Labas, Pasauli, !]
        System.out.println(ml.get(1)); // turi grazinti Pasauli
        ml.remove(0);
        System.out.println(ml); // [Pasauli, !]
        System.out.println(ml.get(1)); // turi atspauzdint !
        ml.insert(0, "Vel labas");
        System.out.println(ml.size()); // 3
        System.out.println(ml); // [Vel labas, Pasauli, !];
        ml.set(1, "Aliau");
        System.out.println(ml); // [Vel labas, Aliau, !];
         */
    }
}
