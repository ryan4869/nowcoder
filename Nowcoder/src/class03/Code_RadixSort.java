package class03;

public class Code_RadixSort {

    public static void main(String[] args) {
        int arr[] = {23,987,54,107,156,3780,47};
        int res[] = radixSort(arr,0,0,maxBits(arr));
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
//        System.out.println(getDigit(23,0));
    }

    public static int maxBits(int arr[]){
        int maxBits = 0;
        for (int i = 0; i <arr.length ; i++) {
            int bits = 0;
            int val = arr[i];
            while (val>0){
                bits++;
                val = val/10;
            }
            if (bits>maxBits){
                maxBits = bits;
            }
        }
        return maxBits;
    }

    public static int[] radixSort(int arr[],int L,int R,int maxBits){
        int bucket[] = new int[arr.length];
        for (int i = 0; i < maxBits; i++) {

            int count[] = new int[10];
            for (int j = 0; j < arr.length; j++) {
                int pos = getDigit(arr[j],i);
                count[pos]++;
            }
            int sum = 0;
            for (int j = 1; j < count.length; j++) {
                count[j] = count[j]+count[j-1];
            }
            for (int j = arr.length-1; j>=0; j--) {
                int pos = getDigit(arr[j],i);
                bucket[count[pos]-1] = arr[j];
                count[pos]--;
            }
            for (int j = 0; j <arr.length ; j++) {
                arr[j] = bucket[j];
            }
        }
        return arr;
    }

    public static int getDigit(int val, int radix){
        for (int i = 0; i <radix ; i++) {
            val = val/10;
        }
        return val%10;
    }
}
