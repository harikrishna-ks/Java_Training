public class Anagram extends  {
    public static void main(String[] args){
        String str1="listen";
        String str2="silent";
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int[] arr=new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        boolean isAnagram=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                isAnagram=false;
                break;
            }
        }        
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }    
    
}
