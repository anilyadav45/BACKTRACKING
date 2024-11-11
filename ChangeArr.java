class Solution {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return; //after base case the forward moved element arr print and return
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // for next idx
        arr[i] = arr[i] - 2; //after hitting the base case it move to backward i.e while returning the callstack 
        //arr[i] = arr[i] - 1 only happen at the time it returning for each value the stacks
    }

}

public class ChangeArr {
    public static void main(String a[]) {
        int arr[] = new int[5]; // empty arr is here we have to fill array by idx+1 then backtrack
        Solution s = new Solution();
        s.changeArr(arr, 0, 1);
        s.printArr(arr); //expected output become [1,2,3,4,5] and after backtrack arr[i] - 2 [-1,0,1,2,3]

    }
}