package mypackage.Basics;

public class logical {
    public static void main(String[] args){
        int a=10;
        int b=45;
        boolean result1= (a<b) && (b<a);
        boolean result2=(a==b) || (b>a);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}
