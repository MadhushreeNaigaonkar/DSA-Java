import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> al , int i1, int i2){
        int temp=al.get(i1);
        al.set(i1, al.get(i2));
        al.set(i2,temp);

        System.out.println("After swap");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(10);
        al.add(9);
        al.add(2);
        System.out.println("Before");
        
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        swap(al,1,4);
        System.out.println();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
}
