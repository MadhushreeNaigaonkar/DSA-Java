public class BintoDec{
    public static int bintodec(int bin){
        int pow=0;
        int dec=0;
        
        while(bin>0){
            int ld= bin%10;
            dec=dec+(int)(ld*Math.pow(2,pow));
            bin /=10;
            pow++;

        }


        return dec;
    }
    public static void main(String[] args) {
        System.out.println(bintodec(111));
    }
}