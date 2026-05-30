import java.util.*;
public class ArrayMult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int brr[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j;j<n;j++){
                arr[i][j]=sc.nextInt();
                brr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int sum = 0;
                for (int k = 0; k < 10; k++) {
                    sum += arr[i][k] * brr[k][j];
                }
                System.out.print(sum + " ");

            }
            System.out.println();
            
        }
    }
    
}
