
import java.util.ArrayList;

public class ArrayListcode {

    public static void main(String[] args) {
        //ArrayList create;

        ArrayList<String> al = new ArrayList<>();

        //arraylist ke andar agar element add karne ho toh;-> .add();
        al.add("hello gla");
        al.add("Cluster 5");
        al.add("sec E");

        //agar elements delete karne ho toh -> .remove();
        al.remove(1);
        System.out.println(al);

        //agar element add karna haii kisi specific index toh -> .add();
        al.add(1, "I am cluster 5 again back");

        System.out.println(al);

        //.set() => kisi bhi particular index pr element set / update;
        al.set(2, "this is set");
        System.out.println(al);
    }
}
