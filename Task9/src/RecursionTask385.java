import java.util.ArrayList;

public class RecursionTask385 {
    public static int sumArray (int [] arr, int i){
        //Base call
        if(i >= arr.length){
            return 0;
        }

        //Recursion call
        return arr[i] +sumArray(arr, i+1);
    }

    public static int sumArray(int[]arr){
        return sumArray(arr, 0);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("sumArray([1, 2, 3])→ " +sumArray(new int[]{1, 2, 3}));
        System.out.println("sumArray([10, 20, 30, 40])→ "+sumArray(new int[]{10, 20, 30, 40}));
        System.out.println("sumArray([5])→ "+sumArray(new int[] {5}));
        System.out.println("sumArray([])→ "+sumArray(new int[]{}));
    }
}
