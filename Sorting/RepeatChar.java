package Sorting;

public class RepeatChar {
   

    public static void main(String ag[]){
        String s = "Madhushreenaigaonkar";
        
        
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i));
                    count+=1;
                    
                }
              
            }
            System.out.print(count);
            count=0;
        }


    
}
    
}
