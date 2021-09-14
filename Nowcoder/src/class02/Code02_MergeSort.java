package class02;

public class Code02_MergeSort {

    public static void main(String[] args) {

    }

    public static void process(int arr[],int L, int R){
        if (L == R){
            return;
        }
        int mid = L + ((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);

    }

    public static void merge(int arr,int L,int R){
        int newArr  = arr;

    }
}
