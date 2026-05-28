import java.util.*;
public class TwoPointMethod {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=n-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
