public class Looping {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        // }

        // int j=10;
        // while(j<=5){
        //     System.out.println(j);
        //     j++;
        // }
        // do{
        //     System.out.println("Output: "+j);
        //     j++;
        // }while(j<=5);
        
        int eve=0;
        int od=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                eve+=i;
            }
            else{
                od+=i;
            }System.out.println("Even sum: " + eve);
        System.out.println("Odd sum: " + od);
        }
        
    
}
}
