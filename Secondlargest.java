public class Secondlargest {
    public static void main(String[] args) {
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int arr[]={20,50,10,30,40};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];
            }
            else if(arr[i]>sec && arr[i]!=lar){
                sec=arr[i];
            }
        }System.out.println("Second large Number"+sec );
    }
    
}
