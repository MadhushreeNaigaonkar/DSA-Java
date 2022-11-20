package Patterns;

public class Character{
    public static void main(String[] args) {
        /*
         A
         BC
         DEF
         GHIJ
        */

        char c= 'A';
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
}