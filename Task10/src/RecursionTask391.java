public class RecursionTask391 {
    public static boolean isSorted(int [] arr, int i){
        //Base call
        if(i >= arr.length - 1){
            return true;
        }

        //Recursion call
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static boolean isSorted(int[]arr){
        return isSorted(arr, 0);
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("isSorted([1, 2, 3, 4])→ "+ isSorted(new int[]{1,2,3,4}));
        System.out.println("isSorted([1, 5, 2, 8])→ "+isSorted(new int[]{1,5,2,8}));
        System.out.println("isSorted([10, 20, 30])→ "+isSorted(new int[]{10,20,30}));
        System.out.println("isSorted([3, 3, 3])→ "+isSorted(new int[]{3,3,3}));

    }
}
