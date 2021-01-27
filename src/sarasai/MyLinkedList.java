package sarasai;

public class MyLinkedList {

    // grandinele
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void add(Object o) {
        if (head == null) {
            // sukuriam naija zieda
            head = new Node();
            // pakabukas
            head.el = o;
        } else {
            // zedas
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node();
            // ziedas prisikabina prie naujo ziedo su pakabuku
            n.next.el = o;
        }
    }

    /* rasti index'a
        int i = 0;
        Node n = head;
        Node d = head;
        while (n != null) {
            n = n.next;
            if(i != index) {
                i++;
                d = n.next;
            }
        }
        return i;
     */

    public Object get(int index) {
        int i = 0;
        String elem = "";
        Node n = head;
        while (n != null) {
            n = n.next;
            if(i != index) {
                i++;
                elem = (String) n.el;
            }
        }
        return elem;
    }

    public void set(int index, Object o) {
        int i = 0;
//        Node elem = null;
        Node n = head;
        Node d = head;
        while (n != null) {
            if(i != index) {
                i++;
                d = n.next;
            } else {
                d.el = o;
            }
            n = n.next;
        }
    }

    public void remove(int index) {
    }

    public void insert(int index, Object o) {
    }

    public int size() {
        int s = 0;
        Node n = head;
        while (n != null) {
            s++;
            n = n.next;
        }
        return s;
    }

    public String toString() {
        String ret = "[";
        ret += "]";
        return ret;
    }

    public void printAll() {
        Node n = head;
        while (n != null) {
            System.out.println(n.el);
            n = n.next;
        }
        System.out.println("--------------");
    }

//    klase reprezentoja zeduka
    private class Node {
        Object el; // zedukas laiko kazkoki pakabuka
        Node next; // zedukas laiko kazkoki sekanti zieda (nuoroda i sekanti zieda)
    }

}