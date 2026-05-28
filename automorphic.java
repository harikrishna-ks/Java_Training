public class automorphic {
    public static void main(String[] args) {
        
        // Automorphic Number
        // int n=36;
        // int sq=n*n;
        // int temp=n;
        // while(temp!=0){
        //     if(temp%10 != sq%10){
        //         System.out.println("Not an Automorphic Number");
        //         return;
        //     }
        //     temp/=10;
        //     sq/=10;
        // }
        //     System.out.println("Automorphic Number");
        
        int n=135;
        int count=0;
        int temp=n;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int a=temp%10;
            sum+=Math.pow(a,count);
            count--;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Number");
        }
        else{
            System.out.println("Not an Number");
        }
    }
}
