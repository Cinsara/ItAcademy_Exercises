package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main_Exercise {

    public static void exerciseList(){
        List<Integer> firstList = new ArrayList<Integer>();

        firstList.add(23);
        firstList.add(567);
        firstList.add(1);

        List<Integer> secondList = new ArrayList<Integer>(firstList);
        Collections.sort(secondList);

        ListIterator<Integer> li = secondList.listIterator();

        System.out.println("The second list in order:");

        while(li.hasNext()){
            System.out.println(li.next());
        }

        li = secondList.listIterator(secondList.size());

        System.out.println("The second list backwards:");

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
