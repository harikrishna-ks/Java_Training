public class max{
    public static void main(String[] args) {
        int max=0;
        int arr[]={1,2,3,5,4};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            }
        }
        System.out.println("Max Value "+max);
    }
    
}
