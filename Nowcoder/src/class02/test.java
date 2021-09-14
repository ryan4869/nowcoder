package class02;

public class test {
    public static void process(int arr[],int L,int R){
        if (L == R){
            return;
        }
        int mid = L + ((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    public static void merge(int arr[],int L,int M,int R){
        int help[] = new int[M-L+1];
        int p = L;
        int q = M+1;
        int i=0;
        while (p<=M && q<=R){
            if (arr[p]<arr[q]){
                help[i++] = arr[p++];
            }
            help[i++] = arr[q++];
        }
    }
}
