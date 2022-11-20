//WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.
public class EvenOdd {

    public static String evenorodd(int n){
        if(n%2==0){
            return "Even";
        }
        return "Odd";
    }
    public static void main(String[] args) {
        System.out.println(evenorodd(4));
        
    }
}
