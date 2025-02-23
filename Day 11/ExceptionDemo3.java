public class ExceptionDemo3 extends ChildDemo {
    public static void main(String[] args) {
        ExceptionDemo3 e = new ExceptionDemo3();
        try{
            e.divide(2,0 );
        }
        catch(ArithmeticException ae){
            System.out.println("check second no");
        }
        
    }
    
}
