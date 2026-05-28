public class StrongNumber{
    public static void main(String[] args){
        // int n=145;
 
        // int sum=0;
        // int temp=n;
        // while(temp!=0){
        //     int a=temp%10;
        //     int fact=1;
        //     for(int i=1;i<=a;i++){
        //         fact=fact*i;
        //     }
        //     sum=sum+fact;
        //     temp/=10;
        // }
        // if(n==sum){
        //     System.out.println("Strong Number "+sum);
        // }
        // else{
        //     System.out.println("Not a Strong Number "+sum);
        // }

        // Automorphic Number
        int n=36;
        int sq=n*n;
        int temp=n;
        while(temp!=0){
            if(temp%10 != sq%10){
                System.out.println("Not an Automorphic Number");
                return;
            }
            temp/=10;
            sq/=10;
        }
            System.out.println("Automorphic Number");
        }
    }
