package homework_01;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {2, 34, 6, 4, 23, 5, 2524, 23, 23, 23, 423, 52, 234243, 23};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

    }






}
