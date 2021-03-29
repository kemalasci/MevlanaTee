import java.util.*;

public class Lists {

    public static void main(String[] args) {
        /*
            Collections
            1.  Set                 // unique
                a.  HashSet         // kendi siralama algoritmasi
                b.  LinkedHashSet   // Girilen siralama
                c.  TreeSet         // Normal Siralar
            2. List
                a.  ArrayList       // Girdigi siralama
                b.  LinkedList      // Girdigi siralama


            3. Map
                a.  HashMap         // (key, value) -> key:unique, kendi siralama algoritmasi
                b.  LinkedHasMap    // Girilen siralama
                c.  TreeMap         // Normal Siralar


         */

        ArrayList<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new LinkedList<>();

        l3.get(2); // random access 2. indexli eleman

        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new LinkedHashSet<>();
        // set ler FIFO


        method1(l1);
        //method1(l2);
        //method1(l3);

        method2(l1);
        method2(l2);
        method2(l3);

        int[] arr1 = new int[5];
        arr1[1]=10;
        System.out.println(Arrays.toString(arr1));
        Object[] arr2 = new Object[2];
        Lists[] arr3 = new Lists[6];

    }

    public static void method1(ArrayList<Integer> l){

    }
    public static void method2(List<Integer> l){

    }
}
