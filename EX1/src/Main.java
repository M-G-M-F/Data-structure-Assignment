public class Main {
    public static void main(String[] args) {
        int []arr = {2,4,6,7,9};
        int result = EX1(arr);
        System.out.println(result);
    }
    public static int EX1(int[]arr){
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
