public class Main {
    public static void main(String[] args) {
        int []arr = {1, 2, 1, 3, 5, 1 };
        int []result = EX3(arr,1);
        System.out.print("[");
        for(int i =0; i<result.length;i++)
            if(i!=result.length-1)
                System.out.print(result[i]+",");
            else
                System.out.print(result[i]);
        System.out.print("]");
    }
    public static int[] EX3(int[] arr, int key) {
        int count=0;
        for (int i=0;i<arr.length;i++)
            if (arr[i]!=key)
                count++;
        int[] result = new int[count];
        int index=0;
        for (int i=0;i<arr.length;i++)
            if (arr[i]!=key)
                result[index++]=arr[i];
        return result;
    }

}
