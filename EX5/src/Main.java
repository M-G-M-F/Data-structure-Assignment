import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        ArrayList<Integer> result = EX5(arr);

        System.out.print("[");
        for(int i =0; i<result.size();i++)
            if(i!=result.size()-1)
                System.out.print(result.get(i)+",");
            else
                System.out.print(result.get(i));
        System.out.print("]");
    }
    public static ArrayList<Integer> EX5(ArrayList<Integer> arr) {
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                unique.add(arr.get(i));
            }
        }
        return unique;
    }
}
