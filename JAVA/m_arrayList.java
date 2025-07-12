import java.util.*;

public class m_arrayList {
    
    public static void main(String[] args) {
        // Integer || Float || String || Boolean

        ArrayList<Integer> list = new ArrayList<>();
        
        // add element
        list.add(0);
        list.add(3);
        list.add(7);

        System.out.println(list);
        
        // get element
        int ele = list.get(1);
        System.out.println(ele);

        // add element in between
        list.add(1, 4);
        System.out.println(list);

        // set element { change position of already placed element }
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        } System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
