public class Permutation {
    public static void findPermutation(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            String newStr=s.substring(0, i)+s.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
        



    }

   public static void main(String[] args) {
    String s = "abc";
    findPermutation(s, "");

   } 
}
