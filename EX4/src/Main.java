import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        int result=EX4(arr);
        System.out.println(result);
    }
    public static int EX4(ArrayList<Integer> arr){
        int sum =0;
        for(int i =0; i<arr.size();i++){
            sum+= arr.get(i);
        }
        return sum;
    }
}
