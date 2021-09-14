package class02;

import java.util.Random;

public class Code03_QuickSort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,7,1,6,5};
    }

    public static void process(int arr[],int L, int R){
        if (L == R){
            return;
        }
        int mid = L + ((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);

    }

    public static void merge(int arr[],int L,int R){
        Random random = new Random();
        int num = random.nextInt(arr.length);
        swap(arr,num,arr.length-1);
        int p = L;
        int l,r = num;
        int q = R;
        while(p <= q){
            if (arr[p] < arr[num]){

                p++;
            }else if (arr[p] == arr[num]){

            }

        }

    }

    public static void swap(int arr[], int a,int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }
}
