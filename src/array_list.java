import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(55);
        arr.add(125);
        System.out.println(arr);
        arr.add(0,7);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.get(3));
        arr.set(0,8);
        System.out.println("Size of arraylist: "+arr.size());
        System.out.println(arr);
        for (int i: arr){
            System.out.println(i);
        }

        arr.clear();
        System.out.println(arr);

    }
}
