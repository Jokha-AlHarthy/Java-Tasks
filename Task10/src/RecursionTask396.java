public class RecursionTask396 {
    public static int sumEvenIndex(int [] arr, int i){
        //Base call
        if(i >= arr.length){
            return 0;
        }

        //Recursion call
        return  arr[i] + sumEvenIndex(arr, i+2);
    }

    public static int sumEvenIndex(int[] arr){
        return sumEvenIndex(arr, 0);
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("sumEvenIndex([10, 5, 20, 5, 30])→ "+ sumEvenIndex(new int[]{10, 5, 20, 5, 30}));
        System.out.println("sumEvenIndex([1, 2, 3, 4])→ "+sumEvenIndex(new int[]{1, 2, 3, 4}));
        System.out.println("sumEvenIndex([7])→ "+sumEvenIndex(new int[]{7}));
        System.out.println("sumEvenIndex([2, 9])→ "+sumEvenIndex(new int[]{2, 9}));

    }
}
