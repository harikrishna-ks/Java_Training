public class RevWord {
    public static void main(String[] args){
        
        String str="Hello world";
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
