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
        //ip 
        //op {1,2,3,a,b,c}
            int arr[]={a,1,b,2,c,3}
            int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>='0' && arr[i]<='9'){
                    arr[index]=arr[i];
                    index++;
                }
            

            }
            System.out.println(Arrays.toString(arr));

    }
}

