

public class NumberInString {
    
    public static void numberInString(int number){

        String words[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        // 1 2 3
        //One Two Three

        if(number == 0){
            
            return;
        }

        int last = number %10;
        String lst= words[last];
        number = number/10;
        numberInString(number);
        System.out.print(lst+" ");



    }


    public static void main(String arge[]){
        numberInString(46378);
    }
}
