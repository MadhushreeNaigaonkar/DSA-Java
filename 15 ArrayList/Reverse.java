import java.util.ArrayList;



public class Reverse {
    public static void print(ArrayList<Integer> al){
        int length=al.size();
        for(int i=0;i<length;i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }

    public static void reverse(ArrayList<Integer> al){
        int start=0;
        int end = al.size()-1;
        while(start<=end){
            int temp=al.get(start);
            al.set(start,al.get(end));
            al.set(end,temp);
            start++;
            end--;
        }

        print(al);

    }

    public static void main(String ag[]){
        ArrayList<Integer> al= new ArrayList<>();
        al.add(2);
        al.add(6);
        al.add(1);
        al.add(3);
        al.add(8);

        reverse(al);

        //or 
        /*
            for(int i=al.size()-1;i>0;i--){
                sout(al.get(i));
            } 
        */
    }
}
