
import java.util.Scanner;
public class subArrSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,-5,7,6};
        int curr=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(curr,max);
        }
        System.out.println(max);
    sc.close();
    }
    
}
