public class RecursionTask386 {
    public static int findMax (int [] arr, int i){
        //Base call
        if(i == arr.length - 1){
            return arr[i];
        }

        //Recursion call
        return Math.max(arr[i], findMax(arr, i + 1));
    }

    public static int findMax(int[]arr){
        return findMax(arr, 0);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("findMax([3, 7, 2, 9, 4])→ " +findMax(new int[]{3, 7, 2, 9, 4}));
        System.out.println("findMax([1, 1, 1])→ "+findMax(new int[]{1,1,1}));
        System.out.println("findMax([-5, -2, -8])→ "+findMax(new int[] {-5, -2, -8}));
        System.out.println("findMax([42])→ "+findMax(new int[]{42}));
    }
}
