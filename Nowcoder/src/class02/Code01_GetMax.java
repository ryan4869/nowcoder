package class02;

public class Code01_GetMax {

    //递归方式求最大值
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,7,1,3};
        //
        int res = process(arr,0,arr.length-1);
        System.out.println(res);
    }

    public static int process(int arr[], int left, int right){
        if (left == right){
            return  arr[left];
        }
        int mid = left + ((right - left)>>1); //求中点 int mid = left + (left + right)/2 可能溢出
        int leftMax = process(arr, left, mid);
        int rightMax = process(arr, mid+1,right);
        return Math.max(leftMax,rightMax);

    }

}
