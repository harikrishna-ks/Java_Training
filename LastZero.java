import java.util.Arrays;
public class LastZero {
    public static void main(String[] args) {
        // int arr[]={1,0,2,0,3,0};
        // int index=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr[index]=arr[i];
        //         index++;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        // while(index<arr.length){
        //     arr[index]=0;
        //     index++;
        // }
        // System.out.print(Arrays.toString(arr));
        int n=5;
        char arr[]=new char[n];
        char a[]=new char[n];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                a[j]=arr[i];
                j++;
            }
            else if(Character.isLetter(arr[i])){
                a[j]=arr[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}

