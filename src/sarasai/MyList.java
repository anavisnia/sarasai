package sarasai;


public class MyList {
    private Object[] list;

    public MyList() {
        list = new Object[0];
    }

    public void add(Object o) {
        Object[] newlist = new Object[this.list.length + 1];
        System.arraycopy(this.list, 0, newlist, 0, this.list.length);
        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }
        newlist[newlist.length - 1] = o;
        this.list = newlist;
    }

//    public void addNew(Object o) {
//        Object[] newlist = new Object[this.list.length + 1];
//        System.arraycopy(this.list, 0, newlist, 0, this.list.length);
//        newlist[newlist.length - 1] = o;
//        this.list = newlist;
//    }

    public Object get(int index) {
        if(index < 0 || index >= this.list.length) {
            throw new IllegalArgumentException("Saraso index elementas negali buti < 0 arba >= this.list.length");
//            return null;
        }
        return this.list[index];
    }

    public void set(int index, Object o) {
        for(int i = 0;  i < list.length; i++ ) {
            if(index < 0 || index > list.length) {
//                continue;
                throw new IllegalArgumentException("Kai idedi elementa, jis negali buti 0 pozicijoi ir uz saraso rybu (list.lenght)");
            }
            if( i == index) {
                list[i] = o;
            }
        }
    }

    public void remove(int index) {
        Object[] editedList = new Object[this.list.length - 1];
        for(int i = 0, j = 0;  i < list.length; i++ ) {
            if( i != index) {
                editedList[j++] = list[i];
            }
        }
        this.list = editedList;
    }

//    public void removeNew(int index) {
//        Object[] newList = new Object[this.list.length - 1];
//        System.arraycopy(this.list, 0, newList, 0, index);
//        System.arraycopy(this.list, index + 1, newList, index, this.list.length - index -1);
//        this.list = newList;
//    }

    public int size() {
        return this.list.length;
    }

    // papildomai

    public void insert(int index, Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for(int i = 0, j = 0; i < newList.length; i++) {
            if(index == i) {
                newList[i] = o;
            } else {
                newList[i] = list[j++];
            }
        }
        this.list = newList;
    }

    public void insertNew(int index, Object o) {
        Object[] newList = new Object[this.list.length + 1];
        if(index > 0) {
            System.arraycopy(this.list, 0, newList, 0, index - 1);
        }
        newList[index] = o;
        System.arraycopy(this.list, index, newList, index + 1, this.list.length - index);
        this.list = newList;
    }

    public String toString() {
        String everyEl = "";
        for (int i = 0; i < list.length; i++) {
            if(i == 0) {
                everyEl += list[i];
            } else {
                everyEl += ", " +  list[i];
            }
        }
        return "[" + everyEl + "]";
    }

//    public String toString() {
//        String ret = "[";
//        for (int i = 0; i < this.list.length; i++) {
//            ret += this.list[i];
//            if(i != this.list.length - 1) {
//                ret += ", ";
//            }
//        }
//        ret += "]";
//        return ret;
//    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("---------------");
    }
}
