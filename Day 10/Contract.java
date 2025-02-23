public interface Contract {
    public static void main(String[] args) {
        System.out.println("hello");

    }
    default void display(){
        System.out.println("i am from display");
    }
    static void print(){ 
        System.out.println("i am from print");
    }
    default void calculate(int a,int b){
        System.out.println(a-b);
    }
    public void result();
    
}
