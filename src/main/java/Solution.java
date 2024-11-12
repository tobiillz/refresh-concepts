import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
//        set.add("Davido");
//        set.add("Burnaboy");
//        set.add("Wizkid");
//        set.add("Timaya");
//        set.add("Davido");
//
//        System.out.println(set);

        for (int i=0;i<10;i++){
            set.add("element_"+i);
            System.out.println(set);
        }
    }


}
