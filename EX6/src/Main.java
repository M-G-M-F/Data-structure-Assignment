import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(1);
        ArrayList<Integer> result = EX6(arr,1);

        System.out.print(result);
    }
    public static ArrayList<Integer> EX6(ArrayList<Integer> list, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            if (list.get(i) != key) result.add(list.get(i));
        }
        return result;
    }

}
