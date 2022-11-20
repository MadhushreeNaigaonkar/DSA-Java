public class Incometax {
    public static void main(String[] args) {
        int salary = 1000000;

        if(salary<500000){
            System.out.println("No Tax");
        }else if(salary>500000 && salary<=1000000){
            double tax = salary * 0.2f;
            System.out.println(tax);
        }else{
            double tax=salary*0.3f;
            System.out.println(tax);
        }
    }
}
