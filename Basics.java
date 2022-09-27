import java.util.ArrayList;

public class Basics{
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(3);
    list.add(4);

    list.add(2,15);
    list.add(3, 18);

    System.out.println(list);
    System.out.println(list.size());

    //print the arraylist
    for(int i=0; i<list.size(); i++)
    {
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
    
    // System.out.println(list);

    // //Get Operation
    // int element = list.get(2);
    // System.out.println(element);

    // //Remove Element
    // //list.remove(2);
    // //System.out.println(list);

    // //set
    // list.set(2,10);
    // System.out.println(list);
    
    // //contains
    // System.out.println(list.contains(2));
    // System.out.println(list.contains(10));
}
}