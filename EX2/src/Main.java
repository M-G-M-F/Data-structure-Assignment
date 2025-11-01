public class Main {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,3,3,4,5};
        int []arr1 = EX2(arr);
        for(int i =0; i<arr1.length;i++)
            if(i!=arr1.length-1)
                System.out.print(arr1[i]+",");
            else
                System.out.print(arr1[i]);
        System.out.print("]");
    }
    public static int[] EX2(int[] arr) {
        int uniqueCount = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j - 1]) {
                uniqueCount++;
            }
        }
            int[] result = new int[uniqueCount];
            result[0] = arr[0];
            int index = 1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    result[index] = arr[i];
                    index++;
                }
            }
            return result;
        }
    }


