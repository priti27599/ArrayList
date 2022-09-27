import java.util.ArrayList;

public class Pairsum {

    //Brute Force
    // public static boolean pairSum(ArrayList<Integer>list, int target)
    // {
    //     for(int i=0; i<list.size();i++)
    //     {
    //         for(int j=i+1; j<list.size(); j++)
    //         {
    //             if(list.get(i)+ list.get(j) == target)
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean pairSum1(ArrayList<Integer>list, int target)
    {
        int lp=0;
        int rp = list.size()-1;

        while(lp != rp)
        {
            //case1
            if(list.get(lp)+list.get(rp) == target)
            {
                return true;
            }
            //case 2
            else if(list.get(lp)+list.get(rp) < target)
            {
               lp++;
            }
            //case 3
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 20;

        System.out.println(pairSum1(list, target));
    }
}
