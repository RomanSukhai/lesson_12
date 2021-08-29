/*
    This is my code,then I have the authors for him
    But I'm know .You must check her,then keep a shar eye)))

 */

package homework_02;

import java.util.*;

/**
 * The(@ Main) class repressent character strings
 * @author Roman Sukhai
 * @see java.lang.Object#toString()
 * @since JDK 18.0
 */

public class Main {

    public static void main(String[] args) {
        //The ArrayList a , where can search object for Class Car
        List <Object> a = new ArrayList<Object>();
        a.add(0, new Car(32,"Пластик",4,2000,600));
        a.add(1,new Car(45,"Метал",3,1900,200));
        a.add(2,new Car(15,"Літій",5,1950,400));
        a.add(3,new Car(65,"Шкіра",5,1953,470));
        //toString object for ArrayList a
        for (Object v : a ){
            System.out.println(v.toString());
        }
        System.out.println();//step down
        System.out.println();//step down again

        List <Object> c = new ArrayList<Object>();
        c.add(new Car(0,"Пластик",0,0000,000));
        int i = 0;
        //toSet object for ArrayList c in ArrayList a
        for (Object bem:a){
            a.set(i,c);
            i++;
        }
        //toString object for ArrayList a again
        System.out.println();
        for (Object v : a ){
            System.out.println(v.toString());
        }



    }


}
