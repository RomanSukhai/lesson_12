import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.remove(2);
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        arrayList1.remove(1);
        System.out.println(arrayList1);
    }
}