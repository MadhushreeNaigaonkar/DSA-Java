public class DectoBin{

    public static int dectobin(int n){
        int pow=0;
        int binnum=0;

        while(n>0){
            int r= n%2;
            binnum=binnum+(r* (int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        return binnum;

    }
    public static void main(String[] args) {
        System.out.println(dectobin(7));
    }
}