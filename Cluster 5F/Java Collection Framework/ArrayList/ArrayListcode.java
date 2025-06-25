
import java.util.ArrayList;

public class ArrayListcode {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        //arraylist add elements -> .add();
        al.add(23);
        al.add(3);
        al.add(34);
        al.add(56);
        al.add(78);
        System.out.println(al);

        //Element ko delete karna haii -> .remove();
        al.remove(2);
        System.out.println(al);

        //accesss -> .get();
        System.out.println(al.get(3));
        System.out.println(al.get(0));

        //set element at particular index; -> .set();
        al.set(0, 11111);
        System.out.println(al);

        al.add(0, 9999);
        System.out.println(al);

    }
}
