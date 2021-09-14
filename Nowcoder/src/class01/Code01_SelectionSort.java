package class01;

public class Code01_SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5,3,6,8,1,7,9,4,2};
        int newArr[] = selectionSort(arr);
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    swap(arr,i,j);
                }
            }

        }
        return arr;
    }

    public static void swap(int arr[], int addA, int addB){
        arr[addA] = arr[addA] ^ arr[addB];
        arr[addB] = arr[addA] ^ arr[addB];
        arr[addA] = arr[addA] ^ arr[addB];
    }
}
