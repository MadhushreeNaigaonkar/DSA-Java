public class FindSubString {
    public static void findSubString(String s, String ans,int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }


        //If Yes
        findSubString(s, ans+s.charAt(i), i+1);

        //if no
        findSubString(s, ans, i+1);

    }
    public static void main(String[] args) {
        String a="abc";
        findSubString(a ,"",0);
    }
}
