public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        //5 output 2i
       try{
        System.out.println(a/b);
       }
       catch(ArithmeticException abc){
        System.out.println("checked b value");
       }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at ExceptionDemo.main(ExceptionDemo.java:5)
        
    }
    
}
