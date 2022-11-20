public class Test{
    public static void main(String[] ag){
       int x=10 , y=5;
       int exp1=(y*(x / y + x /y));
       int exp2=(y*x/y+y*x/y);
       System.out.println(exp1 +" "+exp2);
    }
}
/*
Q.1)PS C:\Java\2 Operators> java Test.java
    5
    4
Q.2)PS C:\Java\2 Operators> java Test.java
    java
Q.3) PS C:\Java\2 Operators> java Test.java
    4 0 0
Q.4)PS C:\Java\2 Operators> java Test.java
    278
Q.5)PS C:\Java\2 Operators> java Test.java
    20 20
*/